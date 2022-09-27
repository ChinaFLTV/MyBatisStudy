package mapper;

/*
 ** @author LiGuanda
 ** @date  PM 5:21:36
 ** @description This is a description of UserMapper
 ** @params
 ** @return
 ** @since version-1.0  */


import pojo.User;

import java.util.List;

/**
 * @author Lenovo
 */
public interface UserMapper {

    int insertUser();

    void updateUser();

    void deleteUser();

    User selectUserById();

    List<User> selectAllUsers();

}
