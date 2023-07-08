package com.proyecto.t2.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.t2.model.dao.ITipoDAO;
import com.proyecto.t2.model.entidad.Tipo;

@Service
public class TipoServiceImp implements ITipoService{
    
    @Autowired
    private ITipoDAO  tipoDAO;

    @Override
    public void guardarTipo(Tipo tipo) {
        tipoDAO.save(tipo);
    }

    @Override
    public List<Tipo> mostrarTipos() {
        return (List<Tipo>)tipoDAO.findAll();
    }
        

    @Override
    public Tipo buscarTipo(Long id) {
        return tipoDAO.findById(id).orElse(null);
    }

    @Override
    public void eliminarTipo(Long id) {
        tipoDAO.deleteById(id);
    }

    @Override
    public List<Tipo> mostrarTiposOrdenAsc() {
        return tipoDAO.findAllByOrderByDescripcionAsc();
    }

   


}
