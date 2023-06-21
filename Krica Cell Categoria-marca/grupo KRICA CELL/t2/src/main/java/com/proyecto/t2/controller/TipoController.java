package com.proyecto.t2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proyecto.t2.model.entidad.Tipo;
import com.proyecto.t2.model.service.ITipoService;

@Controller
@RequestMapping("/tipos")
public class TipoController {
    
    @Autowired
    private ITipoService tipoService;

    @RequestMapping("/")
    public String inicio(Model model){
        Tipo tipo = new Tipo();
        model.addAttribute("tipo", tipo);
        model.addAttribute("titulo", "Registrar Nuevo Tipo");
        model.addAttribute("listaTipos", tipoService.mostrarTipos());
        return "tipos/index";
    }
    
    @RequestMapping("/guardar")
    public String guardar(Tipo tipo){
        tipoService.guardarTipo(tipo);
        return "redirect:/tipos/";
    }

    @RequestMapping("/mostrarEditar/{id}")
    public String editar(@PathVariable(value = "id")Long id, Model model){
        Tipo tipo = new Tipo();
        tipo = tipoService.buscarTipo(id);
        model.addAttribute("tipo", tipo);
        model.addAttribute("titulo", "Modificar Tipo");
        model.addAttribute("listaTipos", tipoService.mostrarTipos());
        return "tipos/index";
    }

    @RequestMapping("/eliminar/{id}")
    public String eliminar(@PathVariable(value = "id")Long id){
        tipoService.eliminarTipo(id);
        return "redirect:/tipos/";
    }
}
