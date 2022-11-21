package com.icac.memberNote.controller;

import com.icac.memberNote.DTO.BoardDTO;
import com.icac.memberNote.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BoardController {
@Autowired
     private BoardService boardService;
//세션 값과 보드 id 값을 통해 DTO 가져옴


@GetMapping("/board/list")
    public String boardList(Model model){

    List<BoardDTO> boardDTOList = boardService.boardList();
    model.addAttribute("boardList" ,boardDTOList);
    return "board/boardList";
}

}
