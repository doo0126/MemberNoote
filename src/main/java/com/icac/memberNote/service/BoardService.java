package com.icac.memberNote.service;

import com.icac.memberNote.DTO.BoardDTO;
import com.icac.memberNote.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    @Autowired
    private BoardRepository boardRepository;




    public List<BoardDTO> boardList() {
        return boardRepository.boardList();
    }
}
