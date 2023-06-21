package com.proyecto.t2.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.t2.model.dao.IProductoDAO;
import com.proyecto.t2.model.entidad.Producto;


@Service
public class ProductoServiceImp implements IProductoService{

    @Autowired
    private IProductoDAO productoDAO;

    @Override
    public void guardarProducto(Producto producto) {
        productoDAO.save(producto);
    }

    @Override
    public List<Producto> listarProductos() {
        return productoDAO.findAllByOrderByNombreAsc();
    }
    @Override
    public String eliminarProducto(Long id) {
        String rpta = "";
        try{
            productoDAO.deleteById(id);
            rpta = "Se elimino el servicio correctamente";
        }catch(Exception e){
            rpta = e.getMessage();
        }
        return rpta;
    }
  
}
