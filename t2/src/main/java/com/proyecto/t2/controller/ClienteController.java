package com.proyecto.t2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clientes")
public class ClienteController {
    
    @RequestMapping("/")
    public String inicio(){
        return "clientes/index";
    }
}
