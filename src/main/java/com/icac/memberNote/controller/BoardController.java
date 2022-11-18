package com.icac.memberNote.controller;

import com.icac.memberNote.DTO.BoardDTO;
import com.icac.memberNote.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import javax.servlet.http.HttpSession;

@Controller
public class BoardController {
@Autowired
     private BoardService boardService;
//세션 값과 보드 id 값을 통해 DTO 가져옴
@PostMapping("/board/read")
public String read(@ModelAttribute ("boardId") Long boardId , Model model ,HttpSession session){
     String sessionEmail =(String)session.getAttribute("loginEmail");
    BoardDTO resultDTO = boardService.read(sessionEmail , boardId);
    model.addAttribute("boardDTO",resultDTO);
     return "member/main";
}
}
