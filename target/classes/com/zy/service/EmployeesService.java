package com.zy.service;

import com.zy.pojo.Employees;

import java.util.List;

public interface EmployeesService {
    List<Employees> findAllEmployees();
    List<Employees> findPageEmployees(Integer pageIndex,Integer pageSize);

    Integer getCount();

    String findNameById(Integer id);
}
