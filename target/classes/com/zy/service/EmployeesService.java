package com.zy.service;

import com.zy.pojo.Employees;

import java.util.List;

public interface EmployeesService {
    List<Employees> findAllEmployees() throws Exception;

    String findNameById(Integer id);
}
