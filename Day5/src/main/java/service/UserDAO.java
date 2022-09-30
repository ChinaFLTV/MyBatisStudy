package service;

/*
 ** @author LiGuanda
 ** @date  PM 2:23:15
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
    public void getUserById() {

        UserMapper mapper = SqlSessionUtils.getSqlSession().getMapper(UserMapper.class);
        System.out.println(mapper.getUserById(13));

    }


    @Test
    public void getCount() {

        UserMapper mapper = SqlSessionUtils.getSqlSession().getMapper(UserMapper.class);
        System.out.println(mapper.getCount());

    }


    @Test
    public void getUserMap() {

        UserMapper mapper = SqlSessionUtils.getSqlSession().getMapper(UserMapper.class);
        System.out.println(mapper.getUserMap("13"));

    }


    @Test
    public void getUserMapList() {

        UserMapper mapper = SqlSessionUtils.getSqlSession().getMapper(UserMapper.class);
        List<Map<String, Object>> userMapList = mapper.getUserMapList();
        System.out.println(userMapList);

    }


    @Test
    public void getUserBlurry() {

        User user = SqlSessionUtils.getSqlSession().getMapper(UserMapper.class).getUserBlurry("IU");
        System.out.println(user);

    }


    @Test
    public void deleteUser() {

        int i = SqlSessionUtils.getSqlSession().getMapper(UserMapper.class).deleteUser("15");
        System.out.println(i);

    }


    @Test
    public void getTable() {

        List<User> users = SqlSessionUtils.getSqlSession().getMapper(UserMapper.class).getTable("user");
        System.out.println(users);

    }


    @Test
    public void insertUser() {

        User user = new User(null, "LinYun", "7758521", 26, "女", "dage3242742226@qq.com");
        int i = SqlSessionUtils.getSqlSession().getMapper(UserMapper.class).insertUser(user);
        System.out.println(user.getId());

    }


}
