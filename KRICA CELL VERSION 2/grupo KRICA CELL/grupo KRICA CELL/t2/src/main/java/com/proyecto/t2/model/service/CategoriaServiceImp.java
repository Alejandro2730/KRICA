package com.proyecto.t2.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.t2.model.dao.ICategoriaDAO;
import com.proyecto.t2.model.entidad.Categoria;

@Service

public class CategoriaServiceImp implements ICategoriaService{
    @Autowired
    private ICategoriaDAO categoriaDao;
    @Override
    public void guardarCategoria(Categoria categoria) {
        categoriaDao.save(categoria);
    }
    @Override
    public List<Categoria> mostrarCategorias() {
       return (List<Categoria>)categoriaDao.findAll();
    }
    @Override
    public Categoria buscarCategoria(Long id) {
        return categoriaDao.findById(id).orElse(null);
    }

    @Override
    public void eliminarCategoria(Long id) {
        categoriaDao.deleteById(id);
    }
    
}
