package com.guo.dao;

import com.guo.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
//  1.获取全部用户数据
    List<User> getUserList();

    List<User> getLikeUser(String value);
//    2.根据id查询
    User getUserById(int id);

    User getUserById2(Map<String, Object> map);
//    3. insert 使用user 使用map
    int insertUser(User user);

    int insertUser2(Map<String,Object> map);

    int updateUser(User user);

    int deleteUser(int id);
}
