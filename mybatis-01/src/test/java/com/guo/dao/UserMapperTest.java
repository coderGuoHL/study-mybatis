package com.guo.dao;

import com.guo.Utils.MyBatisUtils;
import com.guo.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMapperTest {
    @Test
    public void getLikeUser(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        UserMapper userMapper =  sqlSession.getMapper(UserMapper.class);
        List<User> list = userMapper.getLikeUser("g");
        for(User user : list){
            System.out.println(user);
        }

        sqlSession.close();
    }

    @Test
    public void test(){
//        第一步 获取session
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

//        执行getMapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.getUserList();

        for(User user : userList){
            System.out.println(user);
        }


        sqlSession.close();
    }

    @Test
    public void getUserById(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.getUserById(1);

        System.out.println(user);

        sqlSession.close();
    }

    @Test
    public void insertUser(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int user = userMapper.insertUser(new User(10, "coder G", "111111"));

//        记得提交事务部
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void updateUser(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.updateUser(new User(10, "coder love", "123456"));

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void delete(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int num = userMapper.deleteUser(3);
        if(num > 0){
            System.out.println("删除成功");
        }

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void insertUser2(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userId", 10);
        map.put("userName", 10);
        map.put("password", 10);

        int num = userMapper.insertUser2(map);
        if(num > 0) {
            System.out.println("insert success!");
        }

        sqlSession.commit();
        sqlSession.close();
    }
}
