package com.proyecto.t2.model.service;

import java.util.List;

import com.proyecto.t2.model.entidad.Marca;

public interface IMarcaService {
    public void guardarMarca(Marca marca);
    public List<Marca> mostrarMarcas();
    public Marca buscarMarca(Long id);
    public void eliminarMarca(Long id);
}
