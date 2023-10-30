package com.springtrash.secondweek.controller;

import com.springtrash.secondweek.model.MemberDto;
import com.springtrash.secondweek.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class MemberController {

    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("/login")
    public String login(String loginId, String password, HttpSession session, Model model){
        MemberDto member = memberService.login(loginId, password);

        // 로그인 실패
        if(member == null){
            model.addAttribute("msg", "유효하지 않는 아이디 또는 비밀번호입니다.");
            return "login";
        }
        // 로그인 성공
        else{
            session.setAttribute("userinfo", member);
            return "redirect:/";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/";
    }

    @GetMapping("/join")
    public String join(){
        return "join";
    }

    @PostMapping("/join")
    public String join(MemberDto memberDto){
        memberService.join(memberDto);
        return "redirect:/user/login";
    }

    @GetMapping("/mypage")
    public String mypage(){
        return "mypage";
    }

    @GetMapping("/update")
    public String update(){
        return "update";
    }

    @PostMapping("/update")
    public String update(String password, String nickname, String statusMessage, String loginId, HttpSession session){
        int result = memberService.updateMember(password, nickname, statusMessage, loginId);
        
        // 수정 성공하면 세션 데이터 갱신
        if(result == 1){
            MemberDto member = memberService.getMember(loginId);
            session.setAttribute("userinfo", member);
        }
        return "redirect:/user/mypage";
    }
}
