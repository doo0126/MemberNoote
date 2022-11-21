package com.icac.memberNote.repository;

import com.icac.memberNote.DTO.BoardDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardRepository {
    @Autowired
   private SqlSessionTemplate sql;


    public  Long findMemberId(String sessionEmail) {
        return sql.selectOne("Member.findById",sessionEmail);
    }

    public BoardDTO board(BoardDTO boardDTO) {
        return  sql.selectOne("Board.board",boardDTO);
    }

    public List<BoardDTO> boardList() {
        return  sql.selectList("Board.boardList");
    }
}
