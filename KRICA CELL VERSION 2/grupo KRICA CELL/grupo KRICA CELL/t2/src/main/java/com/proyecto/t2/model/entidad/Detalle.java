package com.proyecto.t2.model.entidad;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "detalles")
public class Detalle implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "det_id")
    private Long id;

    @Column(name = "ven_id")
    private Long id_ven;

    @Column(name = "det_fecha")
    private Date fecha;

    @Column(name = "pro_id")
    private Long id_pro;

    @Column(name = "ser_id")
    private Long id_ser;

    @Column(name = "importe")
    private Double impor; // Decimal en base de datos

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId_ven() {
        return id_ven;
    }

    public void setId_ven(Long id_ven) {
        this.id_ven = id_ven;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Long getId_pro() {
        return id_pro;
    }

    public void setId_pro(Long id_pro) {
        this.id_pro = id_pro;
    }

    public Long getId_ser() {
        return id_ser;
    }

    public void setId_ser(Long id_ser) {
        this.id_ser = id_ser;
    }

    public Double getImpor() {
        return impor;
    }

    public void setImpor(Double impor) {
        this.impor = impor;
    }

   

  

    
}
