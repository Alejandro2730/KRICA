package com.proyecto.t2.model.service;

import java.util.List;

import com.proyecto.t2.model.entidad.Trabajador;

public interface ITrabajadorService {
    public void guardarTrabajador(Trabajador trabajador);
    public List<Trabajador> mostrarTrabajador();
    public Trabajador buscarTrabajador(Long id);
    public void eliminarTrabajador(Long id);
}
