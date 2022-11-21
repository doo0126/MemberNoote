package com.icac.memberNote.controller;

import com.icac.memberNote.DTO.MemberDTO;
import com.icac.memberNote.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

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

        boolean loginResult = memberService.login(memberDTO);
        if (loginResult) {
            // 세션에 로그인한 사용자의 이메일을 저장
            session.setAttribute("loginEmail", memberDTO.getMemberEmail());
            model.addAttribute("memberId", memberDTO.getId());
            String loginEmail=(String)session.getAttribute("loginEmail");
            return "redirect:/board/list";
        } else {
            return "index";
        }
    }
    @PostMapping("/member/emailCheck")
    public @ResponseBody String  emailCheck(@RequestParam("inputEmail") String inputEmail){
        System.out.printf("받아온 값%s\n",inputEmail);
        return memberService.emailCheck(inputEmail);



    }

}
