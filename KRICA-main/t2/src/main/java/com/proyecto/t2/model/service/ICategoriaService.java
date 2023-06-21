package com.proyecto.t2.model.service;

import java.util.List;

import com.proyecto.t2.model.entidad.Categoria;

public interface ICategoriaService {
    
    public void guardarCategoria(Categoria categoria);
    public List<Categoria> mostrarCategoria();
    public Categoria buscarCategoria(Long id);
    public void eliminarCategoria(Long id);
    public List<Categoria> mostrarCategoriaOrdenAsc();


}