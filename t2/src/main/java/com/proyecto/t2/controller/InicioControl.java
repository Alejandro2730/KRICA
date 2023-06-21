package com.proyecto.t2.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class InicioControl {
    @RequestMapping("/")
    public String inicio() {
        return "index";
    }

    @RequestMapping("/ACCESORIOS")
    public String accesorios() {
        return "ACCESORIOS.html";
    }

    @RequestMapping("/PROTECCION")
    public String proteccion() {
        return "PROTECCION.html";
    }
    @RequestMapping("/SERVICIO_TECNICO")
    public String serviciotecnico() {
        return "SERVICIO_TECNICO.html";
    }
    @RequestMapping("/CATALOGO")
    public String catalogo() {
        return "CATALOGO.html";
    }
    @RequestMapping("/login")
    public String login() {
        return "login.html";
    }
    @RequestMapping("/dashboard")
    public String dashboard() {
        return "dashboard.html";
    }
}
