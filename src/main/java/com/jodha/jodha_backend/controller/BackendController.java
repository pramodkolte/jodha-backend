package com.jodha.jodha_backend.controller;

import com.jodha.jodha_backend.model.LoginDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api-v1")
public class BackendController {

    Logger logger = LoggerFactory.getLogger(BackendController.class);

    @GetMapping("/hello")
    public String hello() {
        return "Hello PK!";
    }

    @PostMapping("/signin")
    public LoginDto signIn(@RequestBody LoginDto loginDto) {
        logger.info("Auth "+loginDto.getUsernameOrEmail()+":"+loginDto.getPassword());
        return loginDto;
    }
}
