package com.springtrash.firstweekexample.controller;

import com.springtrash.firstweekexample.model.MemberDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller("/user")
public class MemberController {

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("/login")
    public String login(MemberDto memberDto){

        return "redirect:/";
    }
}
