package com.devlogs.apolo.osg.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;

@RequestMapping("api/v1/auth")
@RestController
public class AuthController {

    @GetMapping("login")
    public ResponseEntity login (HttpServletRequest req) {
        return new ResponseEntity(new Object() {
            public String accessToken = req.getHeader("Authorization").split(" ")[1];
        }, HttpStatus.OK);
    }
}
