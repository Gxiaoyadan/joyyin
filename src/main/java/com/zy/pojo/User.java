package com.zy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String id;
    private String name;
    private String password;
    private String phone;
    private String sex;
    private String birthday;
    private String email;
    private String role;
    private String registerDateTime;
    private String loginDateTime;
    private String loginStatus;
    private String accountStatus;

}
