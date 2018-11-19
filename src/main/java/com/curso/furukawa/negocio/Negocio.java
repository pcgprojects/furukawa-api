package com.curso.furukawa.negocio;

import com.curso.furukawa.entidades.Cliente;
import com.curso.furukawa.entidades.Producto;
import com.curso.furukawa.repositorio.ClienteRepositorio;
import com.curso.furukawa.repositorio.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Negocio {

    @Autowired
    private ProductoRepositorio productoRepositorio;

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    public Producto ObtenerProducto(Long codigo){
        return productoRepositorio.buscarStock(codigo);
    }

    public Producto registrarProducto(Producto producto){
        return productoRepositorio.save(producto);
    }


    /*CLIENTE */

    public Cliente nuevoCliente(Cliente cliente){ return clienteRepositorio.save(cliente);}
    public Cliente obtenerClienteXCodigo(Long codigo){return clienteRepositorio.buscarCliente(codigo);}
    public List<Cliente> obtenerClientes(){return clienteRepositorio.buscarClientes();}



}
