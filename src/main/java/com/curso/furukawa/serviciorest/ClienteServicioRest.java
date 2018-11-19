package com.curso.furukawa.serviciorest;

import com.curso.furukawa.entidades.Cliente;
import com.curso.furukawa.negocio.Negocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/furukawa")
public class ClienteServicioRest {


    @Autowired
    private Negocio negocio;

    @GetMapping("/client/{codigo}")
    public Cliente consultarCliente(@PathVariable(value = "codigo") Long codigo){
        return negocio.obtenerClienteXCodigo(codigo);
    }

    @GetMapping("/client")
    public List<Cliente> consultarClientes(){
        return negocio.obtenerClientes();
    }

    @PostMapping("/client")
    public Cliente nuevoCliente(@RequestBody Cliente cliente) {
        return  negocio.nuevoCliente(cliente);
    }
}
