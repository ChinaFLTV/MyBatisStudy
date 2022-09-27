package service;
/*
 ** @author LiGuanda
 ** @date  PM 5:27:09
 ** @description This is a description of service.Day1Test
 ** @params
 ** @return
 ** @since version-1.0  */


import mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import pojo.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author Lenovo
 */
public class Day1Test {


    @SuppressWarnings("resource")
    @Test
    public void addUser() throws IOException {

        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder factoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = factoryBuilder.build(is);
        SqlSession session = factory.openSession(true);
        UserMapper userMapper = session.getMapper(UserMapper.class);
        int result = userMapper.insertUser();
        System.out.println("The number of rows which was influenced is " + result);

    }


    @Test
    public void updateUser() throws IOException {

        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = sessionFactory.openSession(true);
        UserMapper mapper = session.getMapper(UserMapper.class);
        mapper.updateUser();

    }


    @Test
    public void deleteUser() throws IOException {

        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = sessionFactory.openSession(true);
        UserMapper mapper = session.getMapper(UserMapper.class);
        mapper.deleteUser();

    }


    @Test
    public void selectUserById() throws IOException {

        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = sessionFactory.openSession(true);
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.selectUserById();
        System.out.println(user);

    }


    @Test
    public void selectAllUsers() throws IOException {

        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.selectAllUsers();
        users.forEach(System.out::println);

    }


}
