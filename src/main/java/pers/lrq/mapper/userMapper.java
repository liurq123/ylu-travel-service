package pers.lrq.mapper;

import org.apache.ibatis.annotations.Mapper;
import pers.lrq.domain.User;


public interface userMapper {

    public User findUserByUsernameAndPassword(User ur);

}
