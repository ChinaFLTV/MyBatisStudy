package service;

/*
 ** @author LiGuanda
 ** @date  PM 4:21:53
 ** @description This is a description of UserDAO
 ** @params
 ** @return
 ** @since version-1.0  */


import mappers.UserMapper;
import org.junit.Test;
import pojo.User;
import utils.SqlSessionUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Lenovo
 */
public class UserDAO {


    @Test
    public void getUserById() {

        UserMapper mapper = SqlSessionUtils.getSqlSession().getMapper(UserMapper.class);
        System.out.println(mapper.getUserById(13));

    }


    @Test
    public void getUserByMap() {

        UserMapper mapper = SqlSessionUtils.getSqlSession().getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("username", "IU");
        map.put("password", "123456");
        System.out.println(mapper.getUserByMap(map));

    }


    @Test
    public void insertUser() {

        UserMapper mapper = SqlSessionUtils.getSqlSession().getMapper(UserMapper.class);
        System.out.println(mapper.insertUser(new User(null, "Dage", "666666", 21, "男", "dage3242742226@gmail.com")));

    }


    @Test
    public void getUserByUsernameAndPassword() {

        UserMapper mapper = SqlSessionUtils.getSqlSession().getMapper(UserMapper.class);
        System.out.println(mapper.getUserByUsernameAndPassword("IU", "123456"));

    }


}
