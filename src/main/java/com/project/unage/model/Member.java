package com.project.unage.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member implements Serializable {

    private String userId;
    private String userName;
    private String pwd;
    private String phone;
    private String email;
    private String create_date;
    private Integer auth;
    private String address;
    
}
