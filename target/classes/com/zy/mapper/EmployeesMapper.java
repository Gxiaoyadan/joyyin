package com.zy.mapper;

import com.zy.pojo.Employees;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface EmployeesMapper{
    List<Employees> findAllEmployees();

    /**
     * 传入多个对象使用@Param绑定参数
     * @param pageIndex
     * @param pageSize
     * @return
     */
    List<Employees> findPageEmployees(@Param("pageIndex") Integer pageIndex, @Param("pageSize") Integer pageSize);

    Integer getCount();

    String findNameById(Integer id);
}
