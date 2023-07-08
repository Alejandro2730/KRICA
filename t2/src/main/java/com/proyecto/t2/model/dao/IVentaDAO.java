package com.proyecto.t2.model.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.proyecto.t2.model.entidad.Venta;

public interface IVentaDAO extends CrudRepository<Venta,Long>{
    public List<Venta> findAllByOrderById();
}
