package com.proyecto.t2.model.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.proyecto.t2.model.entidad.Orden;

public interface IOrdenDAO extends CrudRepository<Orden,Long>{
    public List<Orden> findAllByOrderById();
}
