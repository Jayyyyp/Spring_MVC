package com.spring.mvc.controller02;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/chap02")
public class MVCController02 {
    // localhost:8080/chap02/hobbies
    @RequestMapping("hobbies")
    public String hobbies(Model model){
        String name = "룰루";

        List<String> hobbies = List.of("밥먹기", "낮잠자기", "낚시"); // List 자료형 생성 및 자료저장

        // .jsp 파일로 보낼 자료들을 적재
        model.addAttribute("n", name);
        model.addAttribute("hList", hobbies);

        // /WEB-INF/views/chap02/hobbies.jsp
        return "/chap02/hobbies";
    }
}
