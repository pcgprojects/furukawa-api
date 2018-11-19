package com.curso.furukawa.serviciorest;

import com.curso.furukawa.entidades.Producto;
import com.curso.furukawa.negocio.Negocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/delivery")
public class ProductoServicioRest {

    @Autowired
    private Negocio negocio;

    @GetMapping("/producto/{codigo}")
    public Producto consultarProducto(@PathVariable(value = "codigo") Long codigo){
        return negocio.ObtenerProducto(codigo);
    }

    @PostMapping("/registrarProducto")
    public Producto registrarProducto(@RequestBody Producto producto) {
        return negocio.registrarProducto(producto);
    }
}
