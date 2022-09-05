package com.zy.controller;

import com.zy.pojo.User;
import com.zy.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/register")
    public String register(@RequestBody User user){

        log.info("receive ReqParam-id is :"+user.toString());
        String res = userService.registerUser(user);

        return res;
    }

    @RequestMapping("/login")
    public String login(@RequestBody User user){
        String userId = user.getId();
        log.info("userId :"+user.getId());
        if (userId==null||"".equals(userId)){
            log.debug("userId为null");
        }else{
            return "loginSuccess";
        }
        return "receive ReqParam-id is :"+user.toString();
    }


}
