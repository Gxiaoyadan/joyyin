package com.zy.service;

import com.zy.mapper.EmployeesMapper;
import com.zy.pojo.Employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeesServiceImpl implements EmployeesService{

    @Autowired
    private EmployeesMapper employeesMapper;
    @Override
    public List<Employees> findAllEmployees() throws Exception {
        return employeesMapper.findAllEmployees();
    }

    @Override
    public String findNameById(Integer id) {
        return employeesMapper.findNameById(id);
    }

}
