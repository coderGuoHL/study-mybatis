package com.guo.dao;

import com.guo.Utils.MyBatisUtils;
import com.guo.pojo.User;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserTest {

    static Logger logger = Logger.getLogger(User.class);
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

    @Test
    public void testLogger(){
        logger.info("进入了testdebug中");
    }

    @Test
    public void getLimitList(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        Map<String,Integer> map = new HashMap<String, Integer>();
        map.put("startIndex", 0);
        map.put("pageSize", 2);

        List<User> list = userMapper.getLimitList(map);
        for (User user : list) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void getUserByRowBounds(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();


        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        RowBounds rowBounds = new RowBounds(0, 2);
        List<User> list = sqlSession.selectList("com.com.guo.dao.UserMapper.getUserByRowBounds",
                null, rowBounds);
        for (User user : list) {
            System.out.println(user);
        }

        sqlSession.close();
    }
}
