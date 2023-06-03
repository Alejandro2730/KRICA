package com.proyecto.t2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proyecto.t2.model.entidad.Trabajador;
import com.proyecto.t2.model.service.ITrabajadorService;

@Controller
@RequestMapping("/trabajadores")
public class TrabajadorController {

    @Autowired
    private ITrabajadorService trabajadorService;
    
    @RequestMapping("/")
    public String inicio(Model model){
        Trabajador trabajador = new Trabajador();
        model.addAttribute("trabajador", trabajador);
        model.addAttribute("titulo", "Registrar Nuevo Trabajador");
        model.addAttribute("listaTrabajadores", trabajadorService.mostrarTrabajador());
        return "trabajadores/index";
    }

    @RequestMapping("/guardar")
    public String guardar(Trabajador trabajador) {
       trabajadorService.guardarTrabajador(trabajador);
        return "redirect:/trabajadores/";
    }

    @RequestMapping("/mostrarEditar/{id}")
    public String editar(@PathVariable(value = "id") Long id, Model model) {
        Trabajador trabajador = new Trabajador();
        trabajador = trabajadorService.buscarTrabajador(id);
        model.addAttribute("trabajador", trabajador);
        model.addAttribute("titulo","Modificar Trabajador");
        model.addAttribute("listaTrabajadores", trabajadorService.mostrarTrabajador());
        return "trabajadores/index";
    }

    @RequestMapping("/eliminar/{id}")
    public String eliminar(@PathVariable(value = "id") Long id, Model model) {
        trabajadorService.eliminarTrabajador(id);
        return "redirect:/trabajadores/";
    }
}