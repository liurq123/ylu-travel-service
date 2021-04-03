package pers.lrq.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pers.lrq.domain.CommentBean;
import pers.lrq.service.HandleComment;
import pers.lrq.utils.ResultInfo;

import javax.servlet.http.HttpServletRequest;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/*
    添加评论和获取评论
 */
@Controller
@CrossOrigin(origins="http://localhost:3000", allowCredentials="true")
public class CommentController {

    @Autowired
    private HandleComment handleComment;

    @RequestMapping(value = "/addComment",method = RequestMethod.POST)
    @ResponseBody
    public ResultInfo addComment(@RequestBody CommentBean commentBean, HttpServletRequest request){
        //前端数据与后端接受数据，会进行数据自动转换
        //System.out.println(commentBean);
        // 因为服务器是提高给多个用户使用的，sesion也是公用的，所以不能只存入一个用户id
        // String session_id = request.getSession().getAttribute("uid").toString();
        // System.out.println("本地id："+session_id);

        //给bean对象添加日期
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateNowStr = sdf.format(date);
        commentBean.setDate(dateNowStr);

        int result = handleComment.addComment(commentBean);
//        System.out.println(result);
        if (result == 1){
            return new ResultInfo(1, "添加成功");
        }
        return new ResultInfo(0,"添加失败");
    }

    @RequestMapping(value = "/addDelComment",method = RequestMethod.POST)
    @ResponseBody
    public ResultInfo addDelComment(@RequestBody CommentBean commentBean){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateNowStr = sdf.format(date);
        commentBean.setDate(dateNowStr);

        int result = handleComment.addDelComment(commentBean);
        if (result == 1){
            return new ResultInfo(1, "添加成功");
        }
        return new ResultInfo(0,"添加失败");
    }

    @RequestMapping(value = "/getCommentByTid",method = RequestMethod.GET)
    @ResponseBody
    public ResultInfo getCommentById(int tid){
        // 接收tid，自动String转int
        //System.out.println(tid);
        List<CommentBean> result = handleComment.getCommentById(tid);
        //System.out.println("查询结果是："+result);
        if (result == null){
            return new ResultInfo(0,"获取失败");
        }
        double total = 0;
        for (CommentBean com:result){
            total = total + com.getScore();
        }
        double average = total/result.size();
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        return new ResultInfo(1,decimalFormat.format(average)+"",result);
    }

    @RequestMapping(value = "/getDelCommentByFid",method = RequestMethod.GET)
    @ResponseBody
    public ResultInfo getDelCommentById(int fid){
        List<CommentBean> result = handleComment.getDelCommentById(fid);
        if (result == null){
            return new ResultInfo(0,"获取失败");
        }
        double total = 0;
        for (CommentBean com:result){
            total = total + com.getScore();
        }
        double average = total/result.size();
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        return new ResultInfo(1,decimalFormat.format(average)+"",result);
    }
}
