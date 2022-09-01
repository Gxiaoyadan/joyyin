package com.zy.mapper;

import com.zy.pojo.Employees;
import org.apache.ibatis.annotations.Select;
import java.util.List;

public interface EmployeesMapper{
    List<Employees> findAllEmployees() throws Exception;

    String findNameById(Integer id);
}
