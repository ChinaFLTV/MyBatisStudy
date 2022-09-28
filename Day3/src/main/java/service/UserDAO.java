package service;

/*
 ** @author LiGuanda
 ** @date  PM 4:54:27
 ** @description This is a description of UserDAO
 ** @params
 ** @return
 ** @since version-1.0  */


import mappers.UserMapper;
import org.junit.Test;
import utils.SqlSessionUtils;

/**
 * @author Lenovo
 */
public class UserDAO {


    @Test
    public void getUserById() {

        UserMapper mapper = SqlSessionUtils.getSqlSession().getMapper(UserMapper.class);
        System.out.println(mapper.getUserById());

    }

    @Test
    public void getUserByUsername() {

        UserMapper mapper = SqlSessionUtils.getSqlSession().getMapper(UserMapper.class);
        System.out.println(mapper.getUserByUsername("IU"));

    }


    @Test
    public void getUserByUsernameAndPassword() {

        UserMapper mapper = SqlSessionUtils.getSqlSession().getMapper(UserMapper.class);
        System.out.println(mapper.getUserByUsernameAndPassword("IU", "123456"));

    }


}
