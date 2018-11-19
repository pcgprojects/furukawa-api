package com.curso.furukawa.entidades;

import javax.persistence.*;

@Entity
@Table(name = "tb_comprobante")
public class ComprobantePago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_ccpp")
    private Long codigo;
    private String fecha;
    private String medioPago;
    private String moneda;
    private double montoTotal;
    private double montoEntregado;
    private double vuelto;

    @OneToOne
    @JoinColumn(name = "cod_pedido")
    private Pedido pedido;


    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public double getMontoEntregado() {
        return montoEntregado;
    }

    public void setMontoEntregado(double montoEntregado) {
        this.montoEntregado = montoEntregado;
    }

    public double getVuelto() {
        return vuelto;
    }

    public void setVuelto(double vuelto) {
        this.vuelto = vuelto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
