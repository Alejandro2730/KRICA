package com.proyecto.t2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.proyecto.t2.model.entidad.Producto;
import com.proyecto.t2.model.entidad.Venta;
import com.proyecto.t2.model.service.IClienteService;
import com.proyecto.t2.model.service.IProductoService;
import com.proyecto.t2.model.service.ITrabajadorService;
import com.proyecto.t2.model.service.IVentaService;

@Controller
@RequestMapping("/ventas")
public class VentaController {
    
    @Autowired
    private IClienteService clienteService;

    @Autowired
    private ITrabajadorService trabajadorService;

    @Autowired
    private IProductoService productoService;

    @Autowired
    private IVentaService ventaService;


    @RequestMapping("/")
    public String inicio(Model model){
        Venta venta = new Venta();
        model.addAttribute("venta", venta);
        model.addAttribute("listaVentas", ventaService.listarVentas());
        model.addAttribute("listaClientes", clienteService.mostrarClientesOrdenAsc());
        model.addAttribute("listaTrabajadores", trabajadorService.mostrarTrabajadorOrdenAsc());
        model.addAttribute("listaProductos", productoService.mostrarProductosOrdenAsc());
        return "ventas/index";

    }

    @RequestMapping(value = "/form", method = RequestMethod.POST)
    public String guardar(Venta venta){
        Producto producto = productoService.obtenerProductoPorId(venta.getProducto().getId());
    venta.setImporte(venta.getCantidad() * producto.getPrecio());
        ventaService.guardarVenta(venta);   
        return "redirect:/ventas/";
    }
}
