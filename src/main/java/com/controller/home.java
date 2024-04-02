package com.controller;

import com.API_DTO.UserInfoDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class home {

    @RequestMapping("/home")
    String print(){
        return "home-page";
    }

    @RequestMapping("/confirmPage")

    String print_2(UserInfoDTO userInfoDTO, Model model){

        model.addAttribute("userInfo",userInfoDTO);
        return "confirm-page";
    }

    @RequestMapping("/resultPage")

    String print3(){
        return "result-page";
    }
}
