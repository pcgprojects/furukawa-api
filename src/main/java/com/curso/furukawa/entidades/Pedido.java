package com.curso.furukawa.entidades;

import javax.persistence.*;

@Entity
@Table(name = "tb_pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_pedido")
    private Long codigo;
    private String fechaEmision;
    private double montoTotal;
    private String direcEntrega;

    @ManyToOne
    @JoinColumn(name = "cod_cliente")
    private Cliente cliente;

    @OneToOne
    @JoinColumn(name = "cod_producto")
    private Producto producto;

    private String cantidadxprod;


    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getDirecEntrega() {
        return direcEntrega;
    }

    public void setDirecEntrega(String direcEntrega) {
        this.direcEntrega = direcEntrega;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getCantidadxprod() {
        return cantidadxprod;
    }

    public void setCantidadxprod(String cantidadxprod) {
        this.cantidadxprod = cantidadxprod;
    }
}
