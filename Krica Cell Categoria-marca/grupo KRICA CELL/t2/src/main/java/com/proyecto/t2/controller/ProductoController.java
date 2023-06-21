package com.proyecto.t2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.proyecto.t2.model.entidad.Producto;
import com.proyecto.t2.model.service.IMarcaService;
import com.proyecto.t2.model.service.IProductoService;

@Controller
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private IProductoService productoService;

    @Autowired
    private IMarcaService marcaService;

    @RequestMapping("/")
    public String inicio(Model model){
        Producto producto = new Producto();
        model.addAttribute("producto", producto);
        model.addAttribute("listarmarcas", marcaService.mostrarMarcasOrdenAsc());
        model.addAttribute("listarproducto", productoService.listarProductos());
        return "productos/index";
    }

    
    @RequestMapping(value = "/form", method = RequestMethod.POST)
    public String guardar(Producto producto){
        productoService.guardarProducto(producto);
        return "redirect:/productos/";
    }

    @RequestMapping("/eliminar/{id}")
    public String eliminar(@PathVariable(value = "id") Long id, Model model, RedirectAttributes flash){
        String rpta = productoService.eliminarProducto(id);
        flash.addFlashAttribute("mensaje", rpta);
        return "redirect:/productos/";
    }
    
}
