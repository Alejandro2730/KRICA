package com.proyecto.t2.model.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.proyecto.t2.model.entidad.Cliente;


public interface IClienteDAO extends CrudRepository<Cliente,Long> {
    public List<Cliente> findAllByOrderByNombreAsc();
}
