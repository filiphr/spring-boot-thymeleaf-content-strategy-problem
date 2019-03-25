package com.example.demothymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Filip Hrisafov
 */
//@Controller
public class HomeController {

    @GetMapping
    public String home() {
        return "index";
    }

}
