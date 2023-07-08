package com.proyecto.t2.model.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.proyecto.t2.model.entidad.Trabajador;

public interface ITrabajadorDAO extends CrudRepository<Trabajador,Long> {
    public List<Trabajador> findAllByOrderByNombreAsc();
}
