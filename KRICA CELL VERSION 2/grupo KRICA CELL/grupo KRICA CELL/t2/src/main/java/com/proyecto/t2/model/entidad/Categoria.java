package com.proyecto.t2.model.entidad;
import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="categorias")
public class Categoria implements Serializable {
    @Id // Es clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto increment
    @Column(name="cat_id") // Relacionado con la table idcategorias
    private Long id;
    @Column(name="cat_nombre")
    private String nombre;
    @Column(name="cat_descripcion")
    private String descripcion;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    

    
}

