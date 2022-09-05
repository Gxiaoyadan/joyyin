package com.zy.service;

import com.zy.mapper.UserMapper;
import com.zy.pojo.User;
import com.zy.utils.TimeUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private TimeUtil timeUtil;
    @Override
    public String registerUser(User user) {
        user.setRegisterDateTime(timeUtil.getNowDateTime());
        user.setRole("1");
        user.setAccountStatus("1");
        log.info("service: {}",user);
        int result = userMapper.insertCompleteUser(user);
        log.info("result:{}",result);
        if ("1".equals(result)){
            log.info("registerSuccess");
            return "registerSuccess";
        }
        return "registerFail";
    }
}
