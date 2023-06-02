package com.proyecto.t2.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.t2.model.dao.IMarcaDAO;
import com.proyecto.t2.model.entidad.Marca;

@Service
public class MarcaServiceImp implements IMarcaService{

    @Autowired
    private IMarcaDAO marcaDAO;

    @Override
    public void guardarMarca(Marca marca) {
        marcaDAO.save(marca);
    }

    @Override
    public List<Marca> mostrarMarcas() {
        return (List<Marca>)marcaDAO.findAll();
    }

    @Override
    public Marca buscarMarca(Long id) {
        return marcaDAO.findById(id).orElse(null);
    }

    @Override
    public void eliminarMarca(Long id) {
        marcaDAO.deleteById(id);
    }
    
}
