package com.teng.restfulcrud.controller;

import com.teng.restfulcrud.excption.UserNameNotExsits;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author
 * @create 2021-06-12 22:19
 */
@ControllerAdvice
public class ExceptionController {

    @ResponseBody
    @ExceptionHandler(UserNameNotExsits.class)
    public Map<String,Object> handleUserException(){
        Map<String,Object> map = new HashMap<>();
        map.put("code","user.notExist");
        map.put("message","用户名不存在");
        return map;
    }
}
