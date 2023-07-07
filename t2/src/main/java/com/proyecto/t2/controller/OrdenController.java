package com.proyecto.t2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.proyecto.t2.model.entidad.Orden;
import com.proyecto.t2.model.entidad.Servicio;
import com.proyecto.t2.model.service.IClienteService;
import com.proyecto.t2.model.service.IOrdenService;
import com.proyecto.t2.model.service.IServicioService;
import com.proyecto.t2.model.service.ITrabajadorService;

@Controller
@RequestMapping("/ordenes")
public class OrdenController {
    
   @Autowired
    private IClienteService clienteService;

    @Autowired
    private ITrabajadorService trabajadorService;

    @Autowired
    private IServicioService servicioService;

    @Autowired
    private IOrdenService ordenService;

    @RequestMapping("/")
    public String inicio(Model model){
        Orden orden = new Orden();
        model.addAttribute("orden", orden);
        model.addAttribute("listaOrdenes", ordenService.listarOrdenes());
        model.addAttribute("listaClientes", clienteService.mostrarClientesOrdenAsc());
        model.addAttribute("listaTrabajadores", trabajadorService.mostrarTrabajadorOrdenAsc());
        model.addAttribute("listaServicios", servicioService.listarServicios());
        return "ordenes/index";
    }

    @RequestMapping(value = "/form", method = RequestMethod.POST)
    public String guardar(Orden orden){
        Servicio servicio = servicioService.obtenerServicioPorId(orden.getServicio().getId());
        orden.setImporte(servicio.getPrecio());
        ordenService.guardarOrden(orden);
        return "redirect:/ordenes/"; 
    }
}
