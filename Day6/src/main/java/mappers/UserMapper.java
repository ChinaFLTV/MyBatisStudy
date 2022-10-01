package mappers;

/*
 ** @author LiGuanda
 ** @date  AM 11:32:24
 ** @description This is a description of UserMapper
 ** @params
 ** @return
 ** @since version-1.0  */


import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;
import pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author Lenovo
 */
public interface UserMapper {


    @MapKey("id")
    Map<String, Object> getUserMap();

    List<User> getUserList();

    User getUserById(@Param("id") String id);

    List<User> getUserListByDept(@Param("dept") Integer dept);


}
