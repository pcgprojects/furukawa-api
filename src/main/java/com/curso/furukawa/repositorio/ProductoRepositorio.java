package com.curso.furukawa.repositorio;

import com.curso.furukawa.entidades.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ProductoRepositorio extends CrudRepository<Producto,Long> {
    @Query("select p from Producto p where p.codigo=:codigo")
    Producto buscarStock(@Param("codigo") Long codigo);
}
