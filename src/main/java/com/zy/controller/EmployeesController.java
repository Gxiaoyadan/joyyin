package com.zy.controller;

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

    @RequestMapping(value = "/getEmployees")
    @ResponseBody
    public List<Employees> getAllEmployees() throws Exception {
        System.out.println("GET ONE");
        List<Employees> empList = employeesService.findAllEmployees();
        System.out.println(empList);
        return employeesService.findAllEmployees();
    }

    @RequestMapping(value = "/getNameById")
    @ResponseBody
    public String getNameById(@RequestParam Integer id){
        return employeesService.findNameById(id);
    }

    @RequestMapping("/empJsp")
    public String empJsp(){
        return "employeesInfo";
    }
}
