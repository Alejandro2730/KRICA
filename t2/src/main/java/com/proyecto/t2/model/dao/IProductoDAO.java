package com.proyecto.t2.model.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.proyecto.t2.model.entidad.Producto;

public interface IProductoDAO extends CrudRepository<Producto, Long>{

    public List<Producto> findAllByOrderByNombreAsc();
    //Declarar Acciones personalizadas

}
