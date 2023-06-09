package com.proyecto.t2.model.entidad;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity 
@Table(name = "productos")
public class Producto implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pro_id")
    private Long id;

    @Column(name = "pro_nombre")
    private String nombre;

    @Column(name = "pro_descripcion")
    private String descripcion;

    @Column(name = "pro_precio")
    private float precio;

    @ManyToOne
    @JoinColumn(name = "mar_id")
    Marca marca;

    @ManyToOne
    @JoinColumn(name = "cat_id")
    Categoria categoria;

      @Column(name = "pro_fecha_registro")
        @Temporal(TemporalType.TIMESTAMP)
    private Date fecha_registro;

        @PrePersist
        @PreUpdate
    public void asignarFecha(){
        fecha_registro = new Date();
    }

    public Date getFecha_registro() {
            return fecha_registro;
        }

        public void setFecha_registro(Date fecha_registro) {
            this.fecha_registro = fecha_registro;
        }

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
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Marca getMarca() {
        return marca;
    }
    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    public Categoria getCategoria() {
        return categoria;
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    
    
}
