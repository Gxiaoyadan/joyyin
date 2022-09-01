package com.zy.vo;

import com.zy.pojo.Employees;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeesVO {
    private List<Employees> data;
    private Integer total;
}
