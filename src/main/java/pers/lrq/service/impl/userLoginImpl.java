package pers.lrq.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pers.lrq.domain.User;
import pers.lrq.mapper.userMapper;
import pers.lrq.service.userLogin;

@Service
public class userLoginImpl implements userLogin {

    @Autowired
    private userMapper UserMapper;

    @Override
    public User findUser(User ur) {
       User user = UserMapper.findUserByUsernameAndPassword(ur);
//        System.out.println(User);
//        if (User != null ){
//            return true;
//        }
        return user;
    }
}
