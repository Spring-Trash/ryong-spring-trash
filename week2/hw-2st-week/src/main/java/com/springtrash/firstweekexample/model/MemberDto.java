package com.springtrash.firstweekexample.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberDto {

    private String loginId;
    private String password;
    private String email;
    private String name;
    private String nickname;
    private String statusMessage;
    private Date createdAt;
    private Date updatedAt;

    public MemberDto(String loginId, String password, String email, String name, String nickname, String statusMessage){
        this.loginId = loginId;
        this.password = password;
        this.email = email;
        this.name = name;
        this.nickname = nickname;
        this.statusMessage = statusMessage;
    }
}
