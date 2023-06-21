package com.proyecto.t2.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.t2.model.dao.ICategoriaDAO;
import com.proyecto.t2.model.entidad.Categoria;

@Service
public class CategoriaServiceImp implements ICategoriaService {
    @Autowired
    private ICategoriaDAO categoriaDAO;
    @Override
    public void guardarCategoria(Categoria categoria) {
        categoriaDAO.save(categoria);        
    }

    @Override
    public List<Categoria> mostrarCategoria() {
        return (List<Categoria>)categoriaDAO.findAll();

    }

    @Override
    public Categoria buscarCategoria(Long id) {
        return categoriaDAO.findById(id).orElse(null);  
    }

    @Override
    public void eliminarCategoria(Long id) {
        categoriaDAO.deleteById(id);
    }

    @Override
    public List<Categoria> mostrarCategoriaOrdenAsc() {
        return categoriaDAO.findAllByOrderByNombreAsc();
    }
    
}
