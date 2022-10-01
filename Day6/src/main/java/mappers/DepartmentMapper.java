package mappers;

/*
 ** @author LiGuanda
 ** @date  PM 1:18:02
 ** @description This is a description of DepartmentMapper
 ** @params
 ** @return
 ** @since version-1.0  */


import org.apache.ibatis.annotations.Param;
import pojo.Department;

public interface DepartmentMapper {


    Department getDepartmentById(@Param("did") Integer did);

    Department getDepartmentByIdPro(@Param("did") Integer did);


}
