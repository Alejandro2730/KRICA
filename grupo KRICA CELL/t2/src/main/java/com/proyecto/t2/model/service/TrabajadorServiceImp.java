package com.proyecto.t2.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.t2.model.dao.ITrabajadorDAO;
import com.proyecto.t2.model.entidad.Trabajador;

@Service
public class TrabajadorServiceImp implements ITrabajadorService{
    
    @Autowired
    private ITrabajadorDAO trabajadorDAO;

    @Override
    public void guardarTrabajador(Trabajador trabajador) {
        trabajadorDAO.save(trabajador);
    }

    @Override
    public List<Trabajador> mostrarTrabajador() {
        return (List<Trabajador>)trabajadorDAO.findAll();
    }

    @Override
    public Trabajador buscarTrabajador(Long id) {
        return trabajadorDAO.findById(id).orElse(null);
    }

    @Override
    public void eliminarTrabajador(Long id) {
        trabajadorDAO.deleteById(id);
    }
}
