package com.icac.memberNote.service;

import com.icac.memberNote.DTO.BoardDTO;
import com.icac.memberNote.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
    @Autowired
    private BoardRepository boardRepository;


    public BoardDTO read(String sessionEmail, Long boardId) {
        BoardDTO boardDTO = new BoardDTO();
        Long memberId=boardRepository.findMemberId(sessionEmail);
        boardDTO.setId(boardId);
        boardDTO.setMemberId(memberId);
        return boardRepository.board(boardDTO);
    }
}
