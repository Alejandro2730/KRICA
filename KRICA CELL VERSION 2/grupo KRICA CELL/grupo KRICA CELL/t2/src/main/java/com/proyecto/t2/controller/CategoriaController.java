package com.proyecto.t2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proyecto.t2.model.entidad.Categoria;
import com.proyecto.t2.model.service.ICategoriaService;

@Controller
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private ICategoriaService categoriaService;

    @RequestMapping("/")
    public String inicio(Model model){
        Categoria categoria = new Categoria();
        model.addAttribute("cat", categoria);
        model.addAttribute("titulo", "Registrar Nueva Categoria");
        model.addAttribute("listaCategorias", categoriaService.mostrarCategorias()); 
        return "categorias/index";
    }

    @RequestMapping("/guardar")
    public String guardar(Categoria categoria){
    categoriaService.guardarCategoria(categoria);
    return "redirect:/categorias/";
    }
    
    @RequestMapping("/mostrarEditar/{id}")
    public String editar(@PathVariable(value = "id")Long id, Model model){
        Categoria categoria = new Categoria();
        categoria = categoriaService.buscarCategoria(id);
        model.addAttribute("cat", categoria);
        model.addAttribute("titulo","Modificar Categoria");
        model.addAttribute("listaCategorias", categoriaService.mostrarCategorias());
        return "categorias/index";
    }

    @RequestMapping("/eliminar/{id}")
    public String eliminar(@PathVariable(value = "id")Long id){
        categoriaService.eliminarCategoria(id);
        return "redirect:/categorias/";
    }
}
