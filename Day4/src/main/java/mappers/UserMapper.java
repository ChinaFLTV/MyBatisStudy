package mappers;

/*
 ** @author LiGuanda
 ** @date  PM 4:17:22
 ** @description This is a description of UserMapper
 ** @params
 ** @return
 ** @since version-1.0  */


import org.apache.ibatis.annotations.Param;
import pojo.User;

import java.util.Map;

/**
 * @author Lenovo
 */
public interface UserMapper {


    User getUserById(Integer id);

    User getUserByMap(Map<String, Object> map);

    Integer insertUser(User user);

    User getUserByUsernameAndPassword(@Param("username") String username, @Param("password") String password);


}
