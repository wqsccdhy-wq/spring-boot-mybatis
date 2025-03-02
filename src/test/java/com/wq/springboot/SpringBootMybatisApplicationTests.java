package com.wq.springboot;

import cn.hutool.json.JSONUtil;
import com.wq.springboot.bean.Employee;
import com.wq.springboot.mapper.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootMybatisApplicationTests {

    @Autowired
    EmployeeMapper employeeMapper;

    @Test
    void contextLoads() {
    }


    @Test
    void test1() {
        Employee empById = employeeMapper.getEmpById(1);
        System.out.println(JSONUtil.toJsonStr(empById));
    }

}
