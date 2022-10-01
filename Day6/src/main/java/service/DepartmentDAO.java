package service;

/*
 ** @author LiGuanda
 ** @date  PM 2:57:58
 ** @description This is a description of DepartmentDAO
 ** @params
 ** @return
 ** @since version-1.0  */


import mappers.DepartmentMapper;
import org.junit.Test;
import pojo.Department;
import utils.SqlSessionUtils;

public class DepartmentDAO {


    @Test
    public void getUserByIdPro() {

        Department department = SqlSessionUtils.getSqlSession().getMapper(DepartmentMapper.class).getDepartmentByIdPro(2);
        System.out.println(department);

    }

}
