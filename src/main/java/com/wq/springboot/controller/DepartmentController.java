package com.wq.springboot.controller;

import com.wq.springboot.bean.Department;
import com.wq.springboot.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName DepartmentController
 * @Description: TODO
 * @Author wangqing
 * @Date 2020/2/1
 * @Version V1.0
 **/
@RestController
public class DepartmentController {

    @Autowired
    private DepartmentMapper departmentMapper;

    @GetMapping("/dept")
    public Department saveDept(Department department){
        departmentMapper.insertDept(department);
        return department;
    }

    @GetMapping("/dept/{id}")
    public Department getDeptById(@PathVariable("id") Integer id){
        Department department = departmentMapper.getDeptById(id);
        return department;
    }
}
