package pers.lrq.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pers.lrq.domain.CommentBean;
import pers.lrq.domain.SelectShowAndImg;
import pers.lrq.utils.ResultInfo;

import javax.servlet.http.HttpServletRequest;

/*
    添加评论和获取评论
 */
@Controller
@CrossOrigin(origins="http://localhost:3000", allowCredentials="true")
public class CommentController {

    @RequestMapping(value = "/addComment",method = RequestMethod.POST)
    @ResponseBody
    public ResultInfo addComment(@RequestBody CommentBean commentBean, HttpServletRequest request){
        System.out.println("我到这里了");
        System.out.println(commentBean);
        String session_id = request.getSession().getAttribute("uid").toString();
        System.out.println("本地id："+session_id);
        return new ResultInfo(1, "我到这里了");
    }
}
