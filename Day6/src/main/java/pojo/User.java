package pojo;

/*
 ** @author LiGuanda
 ** @date  AM 11:54:18
 ** @description This is a description of User
 ** @params
 ** @return
 ** @since version-1.0  */


/**
 * @author Lenovo
 */
public class User {


    private Integer id;
    private String username;
    private String password;
    private Integer age;
    private String sex;
    private String email;
    private int departmentID;
    private Department department;


    public User() {


    }


    public User(Integer id, String username, String password, Integer age, String sex, String email, int departmentID, Department department) {

        this.id = id;
        this.username = username;
        this.password = password;
        this.age = age;
        this.sex = sex;
        this.email = email;
        this.departmentID = departmentID;
        this.department = department;

    }


    public void setId(Integer id) {

        this.id = id;

    }


    public void setUsername(String username) {

        this.username = username;

    }


    public void setPassword(String password) {

        this.password = password;

    }


    public void setAge(Integer age) {

        this.age = age;

    }


    public void setSex(String sex) {

        this.sex = sex;

    }


    public void setEmail(String email) {

        this.email = email;

    }


    public void setDepartmentID(int departmentID) {

        this.departmentID = departmentID;

    }


    public void setDepartment(Department department) {

        this.department = department;

    }


    public Integer getId() {

        return id;

    }


    public String getUsername() {

        return username;

    }


    public String getPassword() {

        return password;

    }


    public Integer getAge() {

        return age;

    }


    public String getSex() {

        return sex;

    }


    public String getEmail() {

        return email;

    }


    public int getDepartmentID() {

        return departmentID;

    }


    public Department getDepartment() {

        return department;

    }


    @Override
    public String toString() {

        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                ", departmentID=" + departmentID +
                ", department=" + department +
                '}';

    }


}
