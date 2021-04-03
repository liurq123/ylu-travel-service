package pers.lrq.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import pers.lrq.domain.SelectShowAndImg;
import pers.lrq.service.impl.GetDetailImpl;
import pers.lrq.utils.ResultInfo;
/*
    获取页面详情
 */
@Controller
@CrossOrigin(origins="http://localhost:3000", allowCredentials="true")
public class GetDetailController {

    @Autowired
    private GetDetailImpl getDetail;

    @RequestMapping(value = "/getSelectDetail",method = RequestMethod.GET)
    @ResponseBody
    public ResultInfo getDetail(String tid){
        System.out.println("我到/getSelectDetail，tid是："+tid);
        SelectShowAndImg selectShowAndImg = getDetail.geSelectDetail(Integer.parseInt(tid));
        System.out.println("SelectShowAndImg是："+selectShowAndImg);
        return new ResultInfo(1, selectShowAndImg);
    }

    @RequestMapping(value = "/getDeliciousDetail",method = RequestMethod.GET)
    @ResponseBody
    public ResultInfo getDeliciousDetail(String fid){
        System.out.println("我到/getDeliciousDetail，fid是："+fid);
        SelectShowAndImg selectShowAndImg = getDetail.getDeliciousDetail(Integer.parseInt(fid));
        System.out.println("SelectShowAndImg是："+selectShowAndImg);
        return new ResultInfo(1, selectShowAndImg);
    }
}
