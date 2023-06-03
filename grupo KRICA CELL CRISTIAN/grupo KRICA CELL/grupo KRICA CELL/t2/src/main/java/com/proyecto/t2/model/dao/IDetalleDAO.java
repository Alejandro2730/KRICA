package com.proyecto.t2.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.proyecto.t2.model.entidad.Detalle;


public interface IDetalleDAO extends CrudRepository<Detalle, Long> {
}