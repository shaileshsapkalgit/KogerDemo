package com.spring.KogerDemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class krogerController {
@GetMapping("/kroger")
    public String kroger() {
        return "kroger";
    }
}
