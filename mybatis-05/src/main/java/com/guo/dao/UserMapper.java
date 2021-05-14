package com.guo.dao;




import com.guo.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

public interface UserMapper {
//  1.获取全部用户数据
    @Select("select * from mybatis.user")
    List<User> getUserList();

    @Select("select * from mybatis.user where id = #{uid}")
    User getUserById(@Param("uid") int id);

    @Update("update user set name=#{name},pwd=#{password} where id=#{uid}")
    int updateUser(@Param("uid") int id, @Param("name")String name, @Param("password")String password);
}
