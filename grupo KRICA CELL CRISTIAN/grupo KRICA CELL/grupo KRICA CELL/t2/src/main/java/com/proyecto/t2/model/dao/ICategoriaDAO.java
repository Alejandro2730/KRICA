package com.proyecto.t2.model.dao;
import org.springframework.data.repository.CrudRepository;

import com.proyecto.t2.model.entidad.Categoria;

public interface ICategoriaDAO extends CrudRepository<Categoria, Long>{
    
}