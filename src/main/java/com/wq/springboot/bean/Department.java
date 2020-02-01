package com.wq.springboot.bean;

/**
 * @ClassName Department
 * @Description: TODO
 * @Author wangqing
 * @Date 2020/2/1
 * @Version V1.0
 **/
public class Department {

    private Integer id;

    private String departmentName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
