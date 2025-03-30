package com.example.serverchillrate.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/*
тестовый endpoint возращает строку
 */
@RestController("/api/v1/test")
public class TestController {
    @GetMapping()
    public String getTest(){
        return "Hello";
    }
}
