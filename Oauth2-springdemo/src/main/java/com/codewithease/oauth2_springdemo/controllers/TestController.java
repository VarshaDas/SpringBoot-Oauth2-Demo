package com.codewithease.oauth2_springdemo.controllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.Map;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @GetMapping("/public")
    public String publicEndpoint() {
        return "Public content accessible to everyone.";
    }

//    @GetMapping("/private")
//    public String privateEndpoint() {
//        return "Private content accessible to authenticated users.";
//    }

    @GetMapping("/private")
    public String privateEndpoint(@AuthenticationPrincipal OAuth2User principal) {
        return "Private content for: " + principal.getAttributes().get("name");
    }
//
    @GetMapping("/profile")
    public Map<String, Object> userProfile(@AuthenticationPrincipal OAuth2User principal) {
        return principal.getAttributes();
    }
//
//
}
