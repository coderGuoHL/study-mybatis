package com.guo.dao;

import com.guo.Utils.MyBatisUtils;
import com.guo.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserTest {
    @Test
    public void getUserList(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = userMapper.getUserList();

        for(User u : list){
            System.out.println(u);

        }
        sqlSession.close();

    }
}
