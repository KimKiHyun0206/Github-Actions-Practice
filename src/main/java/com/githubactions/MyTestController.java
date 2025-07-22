package com.githubactions;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyTestController {

    @ResponseBody
    @RequestMapping("/")
    public String home(Model model) {
        return "home 입니다.";
    }
}