package com.zc.cris.springbootwar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author zc-cris
 * @Version 1.0
 **/
@Controller
public class HelloController {

    @GetMapping("/hello")
    public String toPage(Model model) {
        model.addAttribute("name", "老二");
        return "success";
    }
}
