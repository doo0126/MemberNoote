package com.icac.memberNote.controller;

import com.icac.memberNote.DTO.MemberDTO;
import com.icac.memberNote.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSession;
import java.lang.reflect.Member;

@Controller
public class MemberController {
    @Autowired
    private MemberService memberService;

    //회원 가입 메소드
    @PostMapping("/member/save")
    public String save(@ModelAttribute MemberDTO memberDTO){
        memberService.save(memberDTO);
        return "index";

    }
    //회원 로그인 메소드
    @PostMapping("/member/login")
    public String login(@ModelAttribute MemberDTO memberDTO, HttpSession session,
                        Model model) {
        System.out.printf("%s\n",memberDTO);
        boolean loginResult = memberService.login(memberDTO);
        if (loginResult) {
            // 세션에 로그인한 사용자의 이메일을 저장
            session.setAttribute("loginEmail", memberDTO.getMemberEmail());
            model.addAttribute("memberId", memberDTO.getId());
            return "member/main";
        } else {
            return "member/login";
        }
    }
}
