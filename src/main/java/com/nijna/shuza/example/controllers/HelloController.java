package com.nijna.shuza.example.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * :=  created by:  Shuza
 * :=  create date:  16-Jul-2018
 * :=  (C) CopyRight Shuza
 * :=  www.shuza.ninja
 * :=  shuza.sa@gmail.com
 * :=  Fun  :  Coffee  :  Code
 **/

@Controller
public class HelloController {

    @GetMapping("/index")
    public ResponseEntity index() {
        System.out.println("==============        Index       ==============");

        return new ResponseEntity("Welcome to Spring example project", HttpStatus.OK);
    }
}
