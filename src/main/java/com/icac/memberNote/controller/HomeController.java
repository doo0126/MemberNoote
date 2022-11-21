package com.icac.memberNote.controller;

import com.icac.memberNote.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {

        return "index";
    }



    @GetMapping("/member/saveForm")
    public String saveForm(){
        return "/member/save";
    }
    @GetMapping("/member/loginForm")
    public String loginForm(){
        return "/member/login";
    }
    @GetMapping("/board/listForm")
    public String listForm(){
        return "/board/list";
    }
}
