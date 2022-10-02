package service;

/*
 ** @author LiGuanda
 ** @date  AM 10:19:59
 ** @description This is a description of DepartmentDAO
 ** @params
 ** @return
 ** @since version-1.0  */


import mappers.DepartmentMapper;
import org.junit.Test;
import pojo.Department;
import utils.SqlSessionUtils;

/**
 * @author Lenovo
 */
public class DepartmentDAO {


    @Test
    public void getDepartmentById() {

        Department departmentById = SqlSessionUtils.getSqlSession().getMapper(DepartmentMapper.class).getDepartmentById(3);
        System.out.println(departmentById);


    }


}
