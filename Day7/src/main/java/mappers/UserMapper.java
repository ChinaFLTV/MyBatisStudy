package mappers;

/*
 ** @author LiGuanda
 ** @date  AM 10:10:41
 ** @description This is a description of UserMapper
 ** @params
 ** @return
 ** @since version-1.0  */


import org.apache.ibatis.annotations.Param;
import pojo.User;

import java.util.ArrayList;
import java.util.List;

public interface UserMapper {


    List<User> getUserListByDept(@Param("dept") Integer dept);

    User getUserCustomized(User user);

    User getUserBySomething(User user);

    int deleteBatch(@Param("ids") Integer[] ids);

    int insertBatch(@Param("users") ArrayList<User> users);

    User getUserPartlyById(@Param("id") Integer id);


}
