package pers.lrq.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pers.lrq.domain.User;
import pers.lrq.service.impl.UserRegisterImpl;
import pers.lrq.utils.ResultInfo;

import javax.servlet.http.HttpServletRequest;

@Controller
@CrossOrigin(origins = "http://localhost:3000",allowCredentials = "true")
public class RegisterController {

    @Autowired
    private UserRegisterImpl userRegister;

    @RequestMapping("/user/register")
    @ResponseBody
    public ResultInfo register(@RequestBody User user, HttpServletRequest request){
        //前端进行数据判空，后端不做重复处理
        //验证码比较
        //前台验证码
        String html_code = user.getCheckCode();
        //后台验证码
        String Code = (String) request.getSession().getAttribute("code");

//        System.out.println("前端："+html_code);
//        System.out.println("后端："+Code);

        if (Code == null){
            ResultInfo r = new ResultInfo(0,"刷新验证码");
            return r;
        }

        //比较验证码是否匹配
        if (!Code.equalsIgnoreCase(html_code)){
            ResultInfo r = new ResultInfo(0,"验证码错误");
            return r;
        }

        //删除session中的验证码
        request.getSession().removeAttribute("code");

        int result = userRegister.SaveUser(user);
        if (result == 0){
            ResultInfo r = new ResultInfo(0,"注册失败，请联系管理员");
            return r;
        }
//        request.getSession().setAttribute("uid",user.getId());
        user.setPassword("");
        ResultInfo r = new ResultInfo(1,"注册成功",user);
        return r;
    }

}
