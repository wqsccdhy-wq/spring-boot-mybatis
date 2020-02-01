package com.wq.springboot.bean;

/**
 * @ClassName Employee
 * @Description: TODO
 * @Author wangqing
 * @Date 2020/2/1
 * @Version V1.0
 **/
public class Employee {

    private Integer id;
    private String lastName;
    private String email;
    private Integer gender;
    private Integer depId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getDepId() {
        return depId;
    }

    public void setDepId(Integer depId) {
        this.depId = depId;
    }
}
