package pojo;

/*
 ** @author LiGuanda
 ** @date  PM 12:26:53
 ** @description This is a description of Department
 ** @params
 ** @return
 ** @since version-1.0  */


import java.util.List;

public class Department {


    private int did;
    private String name;
    private List<User> userList;


    public Department() {


    }


    public Department(int did, String name, List<User> userList) {

        this.did = did;
        this.name = name;
        this.userList = userList;

    }


    public void setDid(int did) {

        this.did = did;

    }


    public void setName(String name) {

        this.name = name;

    }


    public void setUserList(List<User> userList) {

        this.userList = userList;

    }


    public int getDid() {

        return did;

    }


    public String getName() {

        return name;

    }


    public List<User> getUserList() {

        return userList;

    }


    @Override
    public String toString() {

        return "Department{" +
                "did=" + did +
                ", name='" + name + '\'' +
                ", userList=" + userList +
                '}';

    }


}
