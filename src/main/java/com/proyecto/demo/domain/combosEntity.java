package com.proyecto.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class combosEntity {
    @Id
    private Long id;
    private String nombre;
    private Integer precio;
    private Float descuento;
    private Long idP1;
    private Long idP2;
    private Long idP3;

    
    @Override
    public String toString() {
        return "combosEntity [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", descuento=" + descuento
                + ", idP1=" + idP1 + ", idP2=" + idP2 + ", idP3=" + idP3 + "]";
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Integer getPrecio() {
        return precio;
    }


    public void setPrecio(Integer precio) {
        this.precio = precio;
    }


    public Float getDescuento() {
        return descuento;
    }


    public void setDescuento(Float descuento) {
        this.descuento = descuento;
    }


    public Long getIdP1() {
        return idP1;
    }


    public void setIdP1(Long idP1) {
        this.idP1 = idP1;
    }


    public Long getIdP2() {
        return idP2;
    }


    public void setIdP2(Long idP2) {
        this.idP2 = idP2;
    }


    public Long getIdP3() {
        return idP3;
    }


    public void setIdP3(Long idP3) {
        this.idP3 = idP3;
    }


    public combosEntity() {
    }


    public combosEntity(String nombre, Integer precio, Float descuento, Long idP1, Long idP2, Long idP3) {
        this.nombre = nombre;
        this.precio = precio;
        this.descuento = descuento;
        this.idP1 = idP1;
        this.idP2 = idP2;
        this.idP3 = idP3;
    }
    
    
}
