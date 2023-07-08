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
@Table(name = "ventas")
public class Venta implements Serializable{
    
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "ven_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "tra_id")
    private Trabajador trabajador;
    
    @ManyToOne
    @JoinColumn(name = "cli_id")
    private Cliente cliente;

    
    @Column(name = "ven_fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha_registro;

        @PrePersist
        @PreUpdate
    public void asignarFecha(){
        fecha_registro = new Date();
    }

    @ManyToOne
    @JoinColumn(name = "pro_id")
    private Producto producto;

    @Column(name = "ven_can")
    private int cantidad;

    @Column(name = "ven_importe")
    private float importe;

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

}
