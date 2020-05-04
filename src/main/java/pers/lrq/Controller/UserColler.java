package pers.lrq.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
/* 2020-03-26 22:25:59
 * React与SpringBoot实现 cookie通信：后端SpringBoot必需的配置1：
 * @CrossOrigin注解，且注明 origins="前端域名 http://localhost:3000", allowCredentials="true"
 *
 * 所有涉及到跨域请求的Controller，都要写成这个样子！
 *
 * 等到React和SpringBoot整合在一起的时候，要不要删掉这个 origins="前端域名 http://localhost:3000" ？
 * 到时候整合在一起时，我没有发起跨域请求，自然@CrossOrigin就不会生效！
 *  */
//@CrossOrigin( origins="http://localhost:3000", allowCredentials="true" )
//@CrossOrigin( origins="http://localhost:8080", allowCredentials="true" )
@CrossOrigin
public class UserColler {
    @RequestMapping( "/user/captcha" )
    public void captcha(HttpServletRequest req, HttpServletResponse res){
//        res.setHeader( "Cache-Control", "no-store,no-cache" ); //缓存设置为 不缓存
//        res.setHeader("expires","0");
//        res.setContentType( "image/jpg" ); //设置响应内容
//        String text = kaptcha.createText(); //生成文本验证码
//        BufferedImage img = kaptcha.createImage( text ); //根据文本验证码，生成图片验证码

        //不想用shiro了，太多坑！
        //ShiroUtils.setCaptcha( text ); //把验证码文本放入Shiro的session中

        /* 2020-03-26 10:17:22 JavaWeb项目 拾忆
         * 将验证码放入当前会话 (HttpSession)中
         * session 是在服务端的，所以不用担心会被截取
         *
         * 前后端分离，无法获取服务器中的验证码！
         *  */
        System.out.println("我到了UserController的ptcah");
        String text = "3tfg";
        req.getSession().setAttribute( "CAPTCHA_SERVER", text );
        String captcha_server = (String)req.getSession().getAttribute( "CAPTCHA_SERVER" ); //获取服务器中的验证码
        System.out.println( "直接访问/user/captcha，服务器中的验证码："+captcha_server );
    }

    /**
     * 用另一个路径，获取session中的验证码
     */
    @RequestMapping( "/user/getCaptcha" )
    @ResponseBody
    public void getCaptcha(HttpServletRequest req){
        System.out.println("我到了UserController的getcaptcah");
        String captcha_server = (String)req.getSession().getAttribute( "CAPTCHA_SERVER" ); //获取服务器中的验证码
        System.out.println("别地方验证码:"+captcha_server);
    }
}
