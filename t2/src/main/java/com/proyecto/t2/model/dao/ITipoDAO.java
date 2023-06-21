package com.proyecto.t2.model.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.proyecto.t2.model.entidad.Tipo;

public interface ITipoDAO extends CrudRepository<Tipo,Long>{
    public List<Tipo> findAllByOrderByDescripcionAsc();
}
