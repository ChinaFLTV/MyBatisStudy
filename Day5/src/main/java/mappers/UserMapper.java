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

import java.util.List;
import java.util.Map;

/**
 * @author Lenovo
 */
public interface UserMapper {


    User getUserById(@Param("id") Integer id);

    Integer getCount();

    Map<String, Object> getUserMap(@Param("id") String id);

    List<Map<String, Object>> getUserMapList();


    User getUserBlurry(@Param("username") String username);

    int deleteUser(@Param("ids") String ids);

    List<User> getTable(@Param("tableName") String user);

    int insertUser(User user);


}
