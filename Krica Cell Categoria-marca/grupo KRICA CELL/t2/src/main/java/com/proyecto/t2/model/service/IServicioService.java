package com.proyecto.t2.model.service;

import java.util.List;

import com.proyecto.t2.model.entidad.Servicio;

public interface IServicioService {
    public void guardarServicio(Servicio servicio);
    public List<Servicio> listarServicios();
    public String eliminarServicio(Long id);
}
