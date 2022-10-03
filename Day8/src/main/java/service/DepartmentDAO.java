package service;

/*
 ** @author LiGuanda
 ** @date  AM 11:27:08
 ** @description This is a description of DepartmentDAO
 ** @params
 ** @return
 ** @since version-1.0  */


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import mappers.DepartmentMapper;
import org.junit.Test;
import pojo.Department;
import pojo.DepartmentExample;
import utils.SqlSessionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lenovo
 */
public class DepartmentDAO {


    @Test
    public void getDepartmentPro() {

        DepartmentMapper mapper = SqlSessionUtils.getSqlSession().getMapper(DepartmentMapper.class);
        DepartmentExample example = new DepartmentExample();
        PageHelper.startPage(3, 2);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        example.createCriteria().andDidIn(list);
        //System.out.println(mapper.selectByExample(null));
        List<Department> departments = mapper.selectByExample(null);
        PageInfo<Department> info = new PageInfo(departments, 3);
        System.out.println(info);


    }

}
