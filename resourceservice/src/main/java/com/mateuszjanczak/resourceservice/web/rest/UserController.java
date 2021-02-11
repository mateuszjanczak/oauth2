package com.mateuszjanczak.resourceservice.web.rest;

import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/whoami")
    public String getUser(OAuth2Authentication auth) {
        return (String) auth.getUserAuthentication().getPrincipal();
    }

}