package com.curso.furukawa.repositorio;

import com.curso.furukawa.entidades.Cliente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClienteRepositorio extends CrudRepository<Cliente,Long> {

    @Query("select p from Cliente p where p.codigo=:codigo")
    Cliente buscarCliente(@Param("codigo") Long codigo);

    @Query("select p from Cliente p")
    List<Cliente> buscarClientes();
}
