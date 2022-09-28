package utils;

/*
 ** @author LiGuanda
 ** @date  PM 5:24:43
 ** @description This is a description of SqlSessionUtils
 ** @params
 ** @return
 ** @since version-1.0  */


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionUtils {


    public static SqlSession getSqlSession() {

        try (InputStream is = Resources.getResourceAsStream("mybatis-config.xml")) {

            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
            return sessionFactory.openSession(true);

        } catch (IOException e) {

            System.err.println("getSqlSession 出现错误！");
            e.printStackTrace();

        }

        return null;


    }


}
