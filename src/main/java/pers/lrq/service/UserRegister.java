package pers.lrq.service;
import pers.lrq.domain.User;

public interface UserRegister {

    // 将用户存入数据库
    public int SaveUser(User user);

}
