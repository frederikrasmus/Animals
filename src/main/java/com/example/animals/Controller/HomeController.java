package com.example.animals.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index() {
        return "home/index";
    }

    @GetMapping("/lion")
    public String lion() {
        return "home/lion";
    }

    @GetMapping("/polar-bear")
    public String polarBear() {
        return "home/polar-bear";
    }

    @GetMapping("/bluewhale")
    public String bluewhale() {
        return "home/bluewhale";
    }

    @GetMapping("/orangutan")
    public String oragnutan() {
        return "home/orangutan";
    }

    @GetMapping("/dove")
    public String dove() {
        return "home/dove";
    }
}
