package com.wq.springboot.mapper;

import com.wq.springboot.bean.Employee;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName EmployeeMpper
 * @Description: TODO
 * @Author wangqing
 * @Date 2020/2/1
 * @Version V1.0
 **/
public interface EmployeeMapper {

    public Employee getEmpById(@Param("id") Integer id);
}
