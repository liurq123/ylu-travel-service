package pers.lrq.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import pers.lrq.domain.ShowAndImg;
import pers.lrq.service.impl.GetDetailImpl;
import pers.lrq.utils.ResultInfo;

@Controller
@CrossOrigin(origins="http://localhost:3000", allowCredentials="true")
public class GetDetailController {

    @Autowired
    private GetDetailImpl getDetail;

    @RequestMapping(value = "/getDetail",method = RequestMethod.GET)
    @ResponseBody
    public ResultInfo getDetail(String rid){
        ShowAndImg showAndImg = getDetail.getDetail(Integer.parseInt(rid));
        return new ResultInfo(1,showAndImg);
    }
}
