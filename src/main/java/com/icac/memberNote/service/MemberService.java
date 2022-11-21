package com.icac.memberNote.service;

import com.icac.memberNote.DTO.MemberDTO;
import com.icac.memberNote.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    @Autowired
   private MemberRepository memberRepository;

    public void save(MemberDTO memberDTO) {
        memberRepository.save(memberDTO);
    }

    public boolean login(MemberDTO memberDTO) {
    MemberDTO result =   memberRepository.login(memberDTO);
    if(result!=null){
        return true;
    }
    else {
        return false;
    }
    }

    public String emailCheck(String inputEmail) {
         String result=memberRepository.emailCheck(inputEmail);
    if(result==null){
        return "ok";
    }
    else{
        return  "false";
    }
    }
}
