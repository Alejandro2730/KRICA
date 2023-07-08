package com.proyecto.t2.model.service;

import java.util.List;

import com.proyecto.t2.model.entidad.Tipo;

public interface ITipoService {
    public void guardarTipo(Tipo tipo);
    public List<Tipo> mostrarTipos();
    public List<Tipo> mostrarTiposOrdenAsc();
    public Tipo buscarTipo(Long id);
    public void eliminarTipo(Long id);
}
