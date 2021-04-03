package pers.lrq.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pers.lrq.domain.SelectShowList;
import pers.lrq.domain.Tol_ShowList;
import pers.lrq.service.impl.GetShowListImpl;
import pers.lrq.utils.ResultInfo;

import java.util.List;

/*
    获取分类列表：精选 与 美食 与 推荐
 */

@Controller
@CrossOrigin(origins="http://localhost:3000", allowCredentials="true")
public class GetShowListController {

    @Autowired
    private GetShowListImpl getShowList;

    @RequestMapping(value = "/category/selected",method = RequestMethod.GET )
    @ResponseBody
    public ResultInfo getSelectShowList(String page){
        System.out.println("page是："+page);

        // 第一次查询当前page，肯定有数据
        List<SelectShowList> result = getShowList.getSelectShowList(Integer.parseInt(page)*10);

        System.out.println("当前列表结果："+result);

        //第二次查询下一个page，判断是否有下一页数据
        List<SelectShowList> result1 = getShowList.getSelectShowList((Integer.parseInt(page)+1)*10);
        System.out.println("下一页列表结果："+ result1);
        boolean hasMore = false;
        if (result1 != null && !result1.isEmpty() ){
            System.out.println("存在下一页");
            hasMore = true;
        }
        else {
            System.out.println("不存在下一页");
        }
        Tol_ShowList<SelectShowList> tol_ShowList =  new Tol_ShowList(result,hasMore);
        return new ResultInfo(1,tol_ShowList);
    }

    @RequestMapping(value = "/category/delicious",method = RequestMethod.GET)
    @ResponseBody
    public ResultInfo getDeliciousShowList(String page){
        System.out.println("page是："+page);
        // 第一次查询当前page，肯定有数据
        List<SelectShowList> result = getShowList.getDelicious((Integer.parseInt(page)+1)*10);
        System.out.println("当前列表结果："+result);

        //第二次查询下一个page，判断是否有下一页数据
        List<SelectShowList> result1 = getShowList.getDelicious((Integer.parseInt(page)+1)*10);
        System.out.println("下一页列表结果："+ result1);
        boolean hasMore = false;
        if (result1 != null && !result1.isEmpty() ){
            System.out.println("存在下一页");
            hasMore = true;
        }
        else {
            System.out.println("不存在下一页");
        }
        Tol_ShowList<SelectShowList> tol_ShowList =  new Tol_ShowList(result,hasMore);
        return new ResultInfo(1,tol_ShowList);
    }

}
