package pers.lrq.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import pers.lrq.domain.User;

import pers.lrq.service.impl.userLoginImpl;
import pers.lrq.utils.ResultInfo;
import pers.lrq.utils.VerifyCodeUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@CrossOrigin(origins="http://localhost:3000", allowCredentials="true")
public class LoginController {
    @Autowired
    private userLoginImpl UserLoginImpl;

    @RequestMapping(value = "/user/getCode")
    public void getCode(HttpServletResponse response, HttpServletRequest request){

        response.setDateHeader("Expires", 0);
        response.setHeader("Cache-Control", "no-cache");
        response.setContentType("image/jpeg");

        //生成随机字串
        String verifyCode = VerifyCodeUtils.generateVerifyCode(4);
//            存入会话session
//        System.out.println("验证码:"+verifyCode);

        request.getSession().setAttribute("code", verifyCode.toLowerCase());

        //生成图片
        int w = 146, h = 33;
        try {
            VerifyCodeUtils.outputImage(w, h, response.getOutputStream(), verifyCode);
        }
        catch (Exception e) {
            System.out.println(e);
        }

    }

    @RequestMapping(value = "/user/login")
    @ResponseBody
    public ResultInfo login(HttpServletRequest request,@RequestBody User user){
        HttpSession session = request.getSession(true);
        //后台的验证码
        String cur_code =(String) session.getAttribute("code");
        //前端发来的验证码
        String html_code = user.getCheckCode();

        if (cur_code == null){
            ResultInfo r = new ResultInfo(0,"刷新验证码");
            return r;
        }

//        System.out.println("前端验证码："+html_code);
//        System.out.println("session验证码："+cur_code);

        if (!cur_code.equalsIgnoreCase(html_code)){
            ResultInfo r = new ResultInfo(0,"验证码错误！");
            return r;
        }

        //删除session中的验证码
        request.getSession().removeAttribute("code");

        User Users = UserLoginImpl.findUser(user);
        if (Users == null){
            ResultInfo r = new ResultInfo(0,"用户或密码错误！");
            return r;
        }
        ResultInfo r = new ResultInfo(1,Users);
        return r;
    }


}
