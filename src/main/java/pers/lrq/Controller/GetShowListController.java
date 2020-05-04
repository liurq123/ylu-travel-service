package pers.lrq.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pers.lrq.domain.ShowList;
import pers.lrq.domain.Tol_ShowList;
import pers.lrq.service.impl.GetShowListImpl;
import pers.lrq.utils.ResultInfo;

import java.util.List;

@Controller
@CrossOrigin(origins="http://localhost:3000", allowCredentials="true")
public class GetShowListController {

    @Autowired
    private GetShowListImpl getShowList;

    @RequestMapping(value = "/category/selected",method = RequestMethod.GET )
    @ResponseBody
    public ResultInfo getshowlist(String page){
        System.out.println("page是："+page);

        // 第一次查询当前page，肯定有数据
        List<ShowList> result = getShowList.getShowList(Integer.parseInt(page)*10);
        System.out.println(result);

        //第二次查询下一个page，判断是否有下一页数据
        List<ShowList> result1 = getShowList.getShowList((Integer.parseInt(page)+1)*10);
        System.out.println(result1);
        boolean hasMore = false;
        if (result1 != null && !result1.isEmpty() ){
            System.out.println("存在下一页");
            hasMore = true;
        }
        else {
            System.out.println("不存在下一页");
        }
        Tol_ShowList tol_ShowList =  new Tol_ShowList(result,hasMore);
        return new ResultInfo(1,tol_ShowList);
    }

}
