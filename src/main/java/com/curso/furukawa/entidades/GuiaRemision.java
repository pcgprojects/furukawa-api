package com.curso.furukawa.entidades;

import javax.persistence.*;

@Entity
@Table(name = "tb_guia")
public class GuiaRemision {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_guia")
    private Long codigo;
    private String destinatario;
    private String direcEntrega;
    private String transportista;
    private String estado;

    @OneToOne
    @JoinColumn(name = "cod_ccpp")
    private ComprobantePago comprobantePago;


    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getDirecEntrega() {
        return direcEntrega;
    }

    public void setDirecEntrega(String direcEntrega) {
        this.direcEntrega = direcEntrega;
    }

    public String getTransportista() {
        return transportista;
    }

    public void setTransportista(String transportista) {
        this.transportista = transportista;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ComprobantePago getComprobantePago() {
        return comprobantePago;
    }

    public void setComprobantePago(ComprobantePago comprobantePago) {
        this.comprobantePago = comprobantePago;
    }
}
