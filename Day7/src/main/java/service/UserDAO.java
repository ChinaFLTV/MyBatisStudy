package service;

/*
 ** @author LiGuanda
 ** @date  AM 10:40:05
 ** @description This is a description of UserDAO
 ** @params
 ** @return
 ** @since version-1.0  */


import mappers.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import pojo.User;
import utils.SqlSessionUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class UserDAO {


    @Test
    public void getUserCustomized() {

        User juJingyi = SqlSessionUtils.getSqlSession().getMapper(UserMapper.class).getUserCustomized(new User(11, null, null, null, null, null, -1, null));
        System.out.println(juJingyi);

    }


    @Test
    public void getUserBySomething() {

        User iu = SqlSessionUtils.getSqlSession().getMapper(UserMapper.class).getUserBySomething(new User(11, "IU", null, null, null, null, -1, null));
        System.out.println(iu);

    }


    @Test
    public void deleteBatch() {

        int i = SqlSessionUtils.getSqlSession().getMapper(UserMapper.class).deleteBatch(new Integer[]{9});
        System.out.println(i);

    }


    @Test
    public void insertBatch() {

        ArrayList<User> users = new ArrayList<>();
        users.add(new User(null, "Jay Chou", "114514", 43, "男", "jaychou@163.com", 2, null));
        users.add(new User(null, "Jolin", "74747410", 42, "女", "jolin@gamil.com", 1, null));
        int i = SqlSessionUtils.getSqlSession().getMapper(UserMapper.class).insertBatch(users);
        System.out.println(i);

    }


    @Test
    public void getUserPartlyById() {

        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        User user = sqlSession.getMapper(UserMapper.class).getUserPartlyById(13);
        System.out.println(user);
        sqlSession.clearCache();
        User user1 = sqlSession.getMapper(UserMapper.class).getUserPartlyById(13);
        System.out.println(user1);

    }


    @Test
    public void testSecondLevelCaches() throws IOException {

        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sessionFactory.openSession(true);
        User user = sqlSession.getMapper(UserMapper.class).getUserPartlyById(13);
        System.out.println(user);
        sqlSession.close();
        SqlSession sqlSession1 = sessionFactory.openSession(true);
        User user1 = sqlSession1.getMapper(UserMapper.class).getUserPartlyById(13);
        System.out.println(user1);
        sqlSession1.close();


    }


}
