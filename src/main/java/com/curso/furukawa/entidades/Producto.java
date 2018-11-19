package com.curso.furukawa.entidades;

import javax.persistence.*;

@Entity
@Table(name = "tb_producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_producto")
    private Long codigo;
    private String descripcion;
    private double precioxuni;
    private String estado;
    private int stock;
    private String codigorespuesta;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioxuni() {
        return precioxuni;
    }

    public void setPrecioxuni(double precioxuni) {
        this.precioxuni = precioxuni;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCodigorespuesta() {
        return codigorespuesta;
    }

    public void setCodigorespuesta(String codigorespuesta) {
        this.codigorespuesta = codigorespuesta;
    }
}
