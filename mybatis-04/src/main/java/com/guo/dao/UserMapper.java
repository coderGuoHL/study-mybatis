package com.guo.dao;




import com.guo.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
//  1.获取全部用户数据
    List<User> getUserList();

    List<User> getLimitList(Map<String,Integer> map);

    List<User> getUserByRowBounds(Map<String,Integer> map);
}
