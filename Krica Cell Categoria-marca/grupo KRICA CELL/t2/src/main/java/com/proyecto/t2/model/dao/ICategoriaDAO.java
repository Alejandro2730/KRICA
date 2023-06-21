package com.proyecto.t2.model.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.proyecto.t2.model.entidad.Categoria;

public interface ICategoriaDAO extends CrudRepository <Categoria,Long>{
    public List<Categoria> findAllByOrderByNombreAsc();
    
}
