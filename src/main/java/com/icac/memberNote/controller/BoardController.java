package com.icac.memberNote.controller;

import com.icac.memberNote.DTO.BoardDTO;
import com.icac.memberNote.DTO.MemberDTO;
import com.icac.memberNote.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class BoardController {
@Autowired
     private BoardService boardService;
//세션 값과 보드 id 값을 통해 DTO 가져옴


@GetMapping("/board/list")
    public String boardList(Model model , HttpSession session){

    List<BoardDTO> boardDTOList = boardService.boardList();
    String loginEmail =(String)session.getAttribute("loginEmail");
    model.addAttribute("boardList" ,boardDTOList);
    model.addAttribute("loginEmail",loginEmail);

    return "board/boardList";
}
@GetMapping("/board/save")
    public String boardSave(@ModelAttribute BoardDTO save){


    return "redirect:/board/list";
}
}
