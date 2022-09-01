package com.zy.controller;

import com.zy.pojo.Employees;
import com.zy.service.EmployeesService;
import com.zy.vo.EmployeesVO;
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

    /**
     * 返回所有emp信息
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/getEmployees")
    @ResponseBody
    public List<Employees> getAllEmployees(){
        System.out.println("GET ONE");
        List<Employees> empList = employeesService.findAllEmployees();
        System.out.println(empList);
        return employeesService.findAllEmployees();
    }

    /**
     * 分页返回emp信息
     * @param pageIndex
     * @param pageSize
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/getPageEmployees")
    @ResponseBody
    public EmployeesVO getPageEmployees(@RequestParam Integer pageIndex,
                                              @RequestParam Integer pageSize){
        EmployeesVO empVO = new EmployeesVO();
        List<Employees> empList = employeesService.findPageEmployees( pageIndex,pageSize);
        int empTotal = employeesService.getCount();
        empVO.setData(empList);
        empVO.setTotal(empTotal);
        return empVO;
    }

    /**
     * 根据id获取name
     * @param id
     * @return
     */
    @RequestMapping(value = "/getNameById")
    @ResponseBody
    public String getNameById(@RequestParam Integer id){
        return employeesService.findNameById(id);
    }

    /**
     * 返回emp信息页面
     * @return
     */
    @RequestMapping("/empJsp")
    public String empJsp(){
        return "employeesInfo";
    }
}
