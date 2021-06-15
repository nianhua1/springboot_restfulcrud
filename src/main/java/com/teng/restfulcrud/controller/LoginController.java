package com.teng.restfulcrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author
 * @create 2021-06-10 21:47
 */
@Controller
public class LoginController {

    @PostMapping("/user/login")
    public String login(@RequestParam("username")String userName,
                        @RequestParam("password")String passWord,
                        Map<String,Object> map, HttpSession session){
        if(!StringUtils.isEmpty(userName) && "123456".equals(passWord)){
            session.setAttribute("loginUser",userName);
            return "redirect:/main.html";
        }else {
            map.put("errormsg","用户名或密码错误");
            return "login";
        }

    }
}
