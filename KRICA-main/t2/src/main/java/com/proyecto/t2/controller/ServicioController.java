package com.proyecto.t2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.proyecto.t2.model.entidad.Servicio;
import com.proyecto.t2.model.service.IServicioService;
import com.proyecto.t2.model.service.ITipoService;

@Controller
@RequestMapping("/servicios")
public class ServicioController {
    
    @Autowired
    private ITipoService tipoService;

    @Autowired
    private IServicioService servicioService;

    @RequestMapping("/")
    public String inicio(Model model){
        Servicio servicio = new Servicio();
        model.addAttribute("servicio", servicio);
        model.addAttribute("listaServicios", servicioService.listarServicios());
        model.addAttribute("listaTipos", tipoService.mostrarTiposOrdenAsc());
        return "servicios/index";
    }

    @RequestMapping(value = "/form", method = RequestMethod.POST)
    public String guardar(Servicio servicio){
        servicioService.guardarServicio(servicio);
        return "redirect:/servicios/";
    }

    @RequestMapping("/eliminar/{id}")
    public String eliminar(@PathVariable(value = "id") Long id, Model model, RedirectAttributes flash){
        String rpta = servicioService.eliminarServicio(id);
        flash.addFlashAttribute("mensaje", rpta);
        return "redirect:/servicios/";
    }

}
