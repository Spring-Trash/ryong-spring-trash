package com.springtrash.secondweek.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BoardDto {
    private int boardId;
    private MemberDto member;
    private String title;
    private String content;
    private Boolean isNotice;
    private Date createdAt;
    private Date updatedAt;

}
