package com.proyecto.t2.model.service;

import java.util.List;

import com.proyecto.t2.model.entidad.Categoria;
import com.proyecto.t2.model.entidad.Marca;

public interface ICategoriaService {
    
    public void guardarCategoria(Categoria categoria);
    public List<Marca> mostrarCategoria();
    public Marca buscarCategoria(Long id);
    public void eliminarCategoria(Long id);
    public List<Marca> mostrarCatcasOrdenAsc();
}