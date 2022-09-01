package com.zy.controller;

import com.alibaba.fastjson.JSON;
import com.zy.pojo.Employees;
import com.zy.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.nio.charset.StandardCharsets;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeesController {
    @Autowired
    private EmployeesService employeesService;

    @RequestMapping(value = "/getEmployees")
    @ResponseBody
    public String getAllEmployees() throws Exception {
        System.out.println("GET ONE");
        System.out.println(employeesService.findAllEmployees());
        String str = JSON.toJSONString(employeesService.findAllEmployees());
        System.out.println(str);
        return new String(str.getBytes(),"UTF-8");
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
