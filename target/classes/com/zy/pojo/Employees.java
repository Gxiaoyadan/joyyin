package com.zy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employees {
    private String account;
    private String name;
    private String sex;
    private Integer age;
    private String birthday;
    private String married;
    private String email;
    private String dept_name;
    private String position_name;
    private String salary;
}
