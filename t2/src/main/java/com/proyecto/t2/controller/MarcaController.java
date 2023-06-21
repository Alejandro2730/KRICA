package com.proyecto.t2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proyecto.t2.model.entidad.Marca;
import com.proyecto.t2.model.service.IMarcaService;

@Controller
@RequestMapping("/marcas")
public class MarcaController {

    @Autowired
    private IMarcaService marcaService;

    @RequestMapping("/")
    public String inicio(Model model){
        Marca marca = new Marca();
        model.addAttribute("marca", marca);
        model.addAttribute("titulo", "Registrar Nueva Marca");
        model.addAttribute("listaMarcas", marcaService.mostrarMarcas()); 
        return "marcas/index";
    }

    @RequestMapping("/guardar")
    public String guardar(Marca marca){
    marcaService.guardarMarca(marca);
    return "redirect:/marcas/";
    }
    
    @RequestMapping("/mostrarEditar/{id}")
    public String editar(@PathVariable(value = "id")Long id, Model model){
        Marca marca = new Marca();
        marca = marcaService.buscarMarca(id);
        model.addAttribute("marca", marca);
        model.addAttribute("titulo", "Modificar Marca");
        model.addAttribute("listaMarcas", marcaService.mostrarMarcas());
        return "marcas/index";
    }

    @RequestMapping("/eliminar/{id}")
    public String eliminar(@PathVariable(value = "id")Long id){
        marcaService.eliminarMarca(id);
        return "redirect:/marcas/";
    }
}
