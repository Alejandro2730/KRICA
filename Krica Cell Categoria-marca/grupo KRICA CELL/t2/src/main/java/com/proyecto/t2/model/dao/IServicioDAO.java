package com.proyecto.t2.model.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.proyecto.t2.model.entidad.Servicio;

public interface IServicioDAO extends CrudRepository<Servicio, Long>{
    public List<Servicio> findAllByOrderByNombreAsc();
}
