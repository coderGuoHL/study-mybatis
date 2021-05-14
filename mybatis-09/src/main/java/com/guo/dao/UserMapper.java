package com.guo.dao;

import com.guo.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User selectById(@Param("id") int id);
    int updateUser(User user);
}
