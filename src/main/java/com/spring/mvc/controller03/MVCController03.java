package com.spring.mvc.controller03;

import org.springframework.stereotype.Controller;
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

}