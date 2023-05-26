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
        model.addAttribute("title", "음식주문 키오스크"); // title라는 이름으로 "title" 문자열 출력
        // http://localhost:8080/chap03/foodform 이라는 주소로 이동(리다이렉트이므로 파일지정이 아님)
//        return "redirect:/foodform"; // 목적 파일로 포워딩하지 않고 목적 메서드 주소로 리다이렉트
        // WEB-INF/views/chap03/foodform.jsp라는 목적 파일로 포워딩
        return "/chap03/foodform"; // 목적 파일인 foodform.jsp로 적재 데이터도 보내는 포워딩 방식
    }
    // 리다이렉트는 데이터 전달이 불가능할까?
    // GET 방식은 url에 쿼리스트링을 붙여서 데이터를 전송하기 때문에
    // 리다이렉트 타켓 URL에 쿼리 스트링을 붙여 리다이렉트를 수행하면 전달 가능하다.

    @RequestMapping("searchform")
    public String searchForm(){
        // /WEB-INF-views/chap03/searchform.jsp
        return "/chap03/searchform";
    }

    // 네이버 쿼리를 받아서 리다이렉션 해주는 메서드 세팅
    @RequestMapping("research")
    public String reSearch(String query){ // query라는 변수에 실려 전송된 데이터 받기
        String resultPage = "redirect:https://search.naver.com/search.naver?query=" + query;
        return resultPage; // 영어로만 가능
    }
}