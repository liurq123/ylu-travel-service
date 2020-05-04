package pers.lrq.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pers.lrq.domain.User;
import pers.lrq.mapper.RegisterMapper;
import pers.lrq.service.UserRegister;

@Service
public class UserRegisterImpl implements UserRegister {

    @Autowired
    private RegisterMapper registerMapper;

    @Override
    public int SaveUser(User user) {
        int result = registerMapper.SaveUser(user);
        return result;
    }
}
