package com.justademo.springboot_deploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
    public class RootController {

        @GetMapping("/")
        public String root() {
            return "Welcome to Root Page";
        }

        @GetMapping("/version")
        public String checkVersion() {
            return "Welcome to deid API Version 1.0.0";
        }
    }