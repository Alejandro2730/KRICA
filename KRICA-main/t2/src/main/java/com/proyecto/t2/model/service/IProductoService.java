package com.proyecto.t2.model.service;

import java.util.List;

import com.proyecto.t2.model.entidad.Producto;

public interface IProductoService {
    public void guardarProducto(Producto producto);
    public List<Producto> listarProductos();
    public String eliminarProducto(Long id);
    
}
