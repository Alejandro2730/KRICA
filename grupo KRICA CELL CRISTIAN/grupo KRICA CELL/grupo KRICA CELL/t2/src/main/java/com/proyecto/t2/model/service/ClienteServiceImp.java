package com.proyecto.t2.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.t2.model.dao.IClienteDAO;
import com.proyecto.t2.model.entidad.Cliente;

@Service
public class ClienteServiceImp implements IClienteService {

    @Autowired
    private IClienteDAO clienteDAO;

    @Override
    public void guardarCliente(Cliente cliente) {
        clienteDAO.save(cliente);
    }

    @Override
    public List<Cliente> mostrarCliente() {
        return (List<Cliente>)clienteDAO.findAll();
    }

    @Override
    public Cliente buscarCliente(Long id) {
        return clienteDAO.findById(id).orElse(null);
    }

    @Override
    public void eliminarCliente(Long id) {
        clienteDAO.deleteById(id);
    }

}
