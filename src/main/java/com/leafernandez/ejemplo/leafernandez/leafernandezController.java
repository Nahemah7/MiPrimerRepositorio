package com.leafernandez.ejemplo.leafernandez;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class leafernandezController {
    @GetMapping("/escobillon")
    public String escobillon() {
        return "aguante lea chao paqui kl";
    }
    
}
