package ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @RequestMapping("/login")
    public String login(HttpSession session) {
        //判断是否已经登录
        if (session.getAttribute("user") != null) {
            System.out.print("agb");
            return "redirect:/";
        }
        System.out.print("agb");
        return "login";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }
}
