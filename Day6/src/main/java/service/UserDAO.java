package service;

/*
 ** @author LiGuanda
 ** @date  AM 11:36:12
 ** @description This is a description of UserDAO
 ** @params
 ** @return
 ** @since version-1.0  */


import mappers.UserMapper;
import org.junit.Test;
import pojo.User;
import utils.SqlSessionUtils;

import java.util.List;
import java.util.Map;

/**
 * @author Lenovo
 */
public class UserDAO {


    @Test
    public void getUserMap() {

        Map<String, Object> userMap = SqlSessionUtils.getSqlSession().getMapper(UserMapper.class).getUserMap();
        System.out.println(userMap);

    }


    @Test
    public void getUserList() {

        List<User> userList = SqlSessionUtils.getSqlSession().getMapper(UserMapper.class).getUserList();
        System.out.println(userList);

    }


    @Test
    public void getUserById() {

        User user = SqlSessionUtils.getSqlSession().getMapper(UserMapper.class).getUserById("13");
        //System.out.println(user);
        System.out.println(user.getUsername());

    }


    @Test
    public void getUserByDept() {

        List<User> list = SqlSessionUtils.getSqlSession().getMapper(UserMapper.class).getUserListByDept(2);
        System.out.println(list);


    }


}
