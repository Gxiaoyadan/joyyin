package com.zy.controller;

import com.alibaba.fastjson.JSON;
import com.zy.pojo.Employees;
import com.zy.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeesController {
    @Autowired
    private EmployeesService employeesService;

    @RequestMapping(value = "/getEmployees.do")
    @ResponseBody
    public String getAllEmployees() throws Exception {
        System.out.println("GET ONE");
        System.out.println(employeesService.findAllEmployees());
        return JSON.toJSONString(employeesService.findAllEmployees());
    }

    @RequestMapping(value = "/getNameById")
    public String getNameById(@RequestParam Integer id){
        return employeesService.findNameById(id);
    }
}
