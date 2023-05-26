package com.spring.mvc.controller03;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/chap03")
public class MVCController03 {

    // 폼으로 넘겨주는 메서드
    @RequestMapping(value="/foodform", method= RequestMethod.GET)
    public String foodForm(){
        return "chap03/foodform";
    }


    @RequestMapping(value="/foodorder", method=RequestMethod.POST)
    public ModelAndView foodOrder(String Name, int orderNumber, String orderFoodName){
        ModelAndView mv = new ModelAndView();

        mv.addObject("Name", Name);
        mv.addObject("orderNumber", orderNumber);
        mv.addObject("orderFoodName", orderFoodName);

        mv.setViewName("chap03/foodresult");

        return mv;
    }

    @RequestMapping("/naver")
    public String naver(){
        // 리다이액트는 "redirect : 보낼주소"; 형식으로 작성하면 실행된다
        // 마치 a 태그를 클릭하는 것처럼 자동으로 페이지를 보낼 주소로 이동시킨다.
        // 이 과정에서 포워딩과는 달리 model.addAttribute()처럼 자료를 첨부해 이동시킬수는 없다.
        // 하지만 get 방식으로 이동하는 만큼 쿼리스트링을 붙여 보내는 것은 가능하다.
        return "redirect:https://www.naver.com";
    }

    @RequestMapping("/goFoodform")
    public String goFoodform(Model model){
        // 리다이렉션은 model.addAttribute()를 통한 데이터 전송이 불가능
        model.addAttribute("test", "음식주문 키오스크"); // test라는 이름으로 "test" 문자열 출력
        return "redirect:/foodform"; // 목적 파일로 포워딩하지 않고 목적 메서드 주소로 리다이렉트
    }
}