package edu.bbte.softeng.lmim2155.ml.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/breads")
public class BreadController {
    @GetMapping
    public String findAll() {
        return "Hello world";
    }
}
