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
    public List<Employees> findAllEmployees(){
        return employeesMapper.findAllEmployees();
    }

    @Override
    public List<Employees> findPageEmployees(Integer pageIndex, Integer pageSize) {
        List<Employees> listPage = employeesMapper.findPageEmployees(pageIndex,pageSize);

        return listPage;
    }

    @Override
    public Integer getCount() {
        return employeesMapper.getCount();
    }

    @Override
    public String findNameById(Integer id) {
        return employeesMapper.findNameById(id);
    }

}
