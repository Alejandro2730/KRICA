package com.proyecto.t2.model.service;

import java.util.List;

import com.proyecto.t2.model.entidad.Detalle;

public interface IDetalleService {
    public void guardarDetalle(Detalle detalle);
    public List<Detalle> mostrarDetalle();
    public Detalle buscarDetalle(Long id);
    public void eliminarDetalle(Long id);
}
