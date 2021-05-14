package com.guo.dao;




import com.guo.pojo.User;

import java.util.List;

public interface UserMapper {
//  1.获取全部用户数据
    List<User> getUserList();

    User getUserById(int id);

    int insertUser(User user);

    int updateUser(User user);

    int deleteUser(int id);
}
