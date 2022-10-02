package mappers;

/*
** @author LiGuanda
** @date  AM 10:14:39
** @description This is a description of DepartmentMapper
** @params
** @return
** @since version-1.0  */


import org.apache.ibatis.annotations.Param;
import pojo.Department;

/**
 * @author Lenovo
 */
public interface DepartmentMapper {


    Department getDepartmentById(@Param("did") Integer did);


}
