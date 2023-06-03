package com.proyecto.t2.model.service;

import java.util.List;

import com.proyecto.t2.model.entidad.Cliente;

public interface IClienteService {
    public void guardarCliente(Cliente cliente);
    public List<Cliente> mostrarCliente();
    public Cliente buscarCliente(Long id);
    public void eliminarCliente(Long id);
}
