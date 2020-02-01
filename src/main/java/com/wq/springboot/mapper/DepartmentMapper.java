package com.wq.springboot.mapper;

import com.wq.springboot.bean.Department;
import org.apache.ibatis.annotations.*;

/**
 * @ClassName DepartmentMapper
 * @Description: 注解版
 * @Author wangqing
 * @Date 2020/2/1
 * @Version V1.0
 **/
//@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id=#{id}")
    public Department getDeptById(Integer id);

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into department(departmentName) values(#{departmentName})")
    public int insertDept(Department department);

    @Delete("delete from department where id=#{id}")
    public int delDeptById(Integer id);

    @Update("update department set departmentName=#{departmentName} where id=#{id}")
    public int updateDept(Department department);
}
