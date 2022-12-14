package com.icac.memberNote.repository;

import com.icac.memberNote.DTO.MemberDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {
    @Autowired
    private SqlSessionTemplate sql;

    public void save(MemberDTO memberDTO) {
     sql.insert("Member.save",memberDTO);
    }

    public MemberDTO login(MemberDTO memberDTO) {
       return sql.selectOne("Member.login",memberDTO);
    }

    public String emailCheck(String inputEmail) {
        return sql.selectOne("Member.emailCheck",inputEmail);
    }
}
