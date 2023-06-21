package com.proyecto.t2.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.t2.model.dao.IDetalleDAO;
import com.proyecto.t2.model.entidad.Detalle;

@Service
public class DetalleService implements IDetalleService {
    @Autowired
    private IDetalleDAO detalleDAO;

    @Override
    public void guardarDetalle(Detalle detalle) {
        detalleDAO.save(detalle);
    }

    @Override
    public List<Detalle> mostrarDetalle() {
        return (List<Detalle>)detalleDAO.findAll();
    }

    @Override
    public Detalle buscarDetalle(Long id) {
        return detalleDAO.findById(id).orElse(null);
    }

    @Override
    public void eliminarDetalle(Long id) {
        detalleDAO.deleteById(id);
    }
    
}
