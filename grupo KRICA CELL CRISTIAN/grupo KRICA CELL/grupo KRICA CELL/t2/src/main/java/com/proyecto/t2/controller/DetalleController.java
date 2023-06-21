package com.proyecto.t2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proyecto.t2.model.entidad.Detalle;
import com.proyecto.t2.model.service.IDetalleService;


@Controller
@RequestMapping("/detalles")
public class DetalleController {

    @Autowired
    private IDetalleService detalleService;
    
    @RequestMapping("/")
    public String inicio(Model model){
        Detalle detalle = new Detalle();
        model.addAttribute("det", detalle);
        model.addAttribute("titulo", "Registrar Nuevo Detalle");
        model.addAttribute("listaDetalles", detalleService.mostrarDetalle());
        return "detalles/index";
    }

    @RequestMapping("/guardar")
    public String guardar(Detalle detalle) {
        detalleService.guardarDetalle(detalle);
        return "redirect:/detalles/";
    }

    @RequestMapping("/mostrarEditar/{id}")
    public String editar(@PathVariable(value = "id") Long id, Model model) {
        Detalle detalle = new Detalle();
        detalle = detalleService.buscarDetalle(id);
        model.addAttribute("det", detalle);
        model.addAttribute("titulo","Modificar Detalle");
        model.addAttribute("listaDetalles", detalleService.mostrarDetalle());
        return "clientes/index";
    }

    @RequestMapping("/eliminar/{id}")
    public String eliminar(@PathVariable(value = "id") Long id, Model model) {
        detalleService.eliminarDetalle(id);
        return "redirect:/detalles/";
    }
}