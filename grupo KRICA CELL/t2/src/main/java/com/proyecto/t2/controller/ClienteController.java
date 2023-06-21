package com.proyecto.t2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proyecto.t2.model.entidad.Cliente;
import com.proyecto.t2.model.service.IClienteService;


@Controller
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private IClienteService clienteService;
    
    @RequestMapping("/")
    public String inicio(Model model){
        Cliente cliente = new Cliente();
        model.addAttribute("cliente", cliente);
        model.addAttribute("titulo", "Registrar Nuevo Cliente");
        model.addAttribute("listaClientes", clienteService.mostrarCliente());
        return "clientes/index";
    }

    @RequestMapping("/guardar")
    public String guardar(Cliente cliente) {
        clienteService.guardarCliente(cliente);
        return "redirect:/clientes/";
    }

    @RequestMapping("/mostrarEditar/{id}")
    public String editar(@PathVariable(value = "id") Long id, Model model) {
        Cliente cliente = new Cliente();
        cliente = clienteService.buscarCliente(id);
        model.addAttribute("cliente", cliente);
        model.addAttribute("titulo","Modificar Cliente");
        model.addAttribute("listaClientes", clienteService.mostrarCliente());
        return "clientes/index";
    }

    @RequestMapping("/eliminar/{id}")
    public String eliminar(@PathVariable(value = "id") Long id, Model model) {
        clienteService.eliminarCliente(id);
        return "redirect:/clientes/";
    }
}
