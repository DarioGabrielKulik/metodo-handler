package com.metodohandler.metodohandler.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/app")
public class AddControllers {

    @GetMapping("/foo")
    public Map<String, String> foo(){
        return Collections.singletonMap("message", "handler del foo controlador" );
    }

    @GetMapping("/bar")
    public Map<String, String> bar(){
        return Collections.singletonMap("message", "handler del bar controlador" );
    }

    @GetMapping("/bas")
    public Map<String, String> bas(){
        return Collections.singletonMap("message", "handler del bas controlador" );
    }

}
