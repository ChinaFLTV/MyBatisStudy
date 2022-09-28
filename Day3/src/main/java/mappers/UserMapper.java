package mappers;

/*
** @author LiGuanda
** @date  PM 4:49:24
** @description This is a description of UserMapper
** @params
** @return
** @since version-1.0  */


import pojo.User;

/**
 * @author Lenovo
 */
public interface UserMapper {


    User getUserById();
    User getUserByUsername(String username);

    User getUserByUsernameAndPassword(String username, String password);


}
