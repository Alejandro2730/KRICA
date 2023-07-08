package com.proyecto.t2.model.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.proyecto.t2.model.entidad.Marca;

public interface IMarcaDAO extends CrudRepository<Marca,Long>{
    public List<Marca> findAllByOrderByNombreAsc();
    
}
