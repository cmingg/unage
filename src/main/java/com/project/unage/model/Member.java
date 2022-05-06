package com.project.unage.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member {

    private int userId_seq;
    private String userId;
    private String userName;
    private String password;
    private String phone;
    private String email;
    private String create_date;
    private int auth;
    private String address;

    public Member toEntity() {
    }
}
