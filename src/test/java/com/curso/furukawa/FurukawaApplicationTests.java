package com.curso.furukawa;

import com.curso.furukawa.entidades.Cliente;
import com.curso.furukawa.entidades.Producto;
import com.curso.furukawa.repositorio.ClienteRepositorio;
import com.curso.furukawa.repositorio.ProductoRepositorio;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
@SpringBootTest
public class FurukawaApplicationTests {

	@Autowired
	private ProductoRepositorio productoRepositorio;

	@Autowired
	private ClienteRepositorio clienteRepositorio;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testProducto(){
		Producto producto = new Producto();
		producto.setDescripcion("Vidrio Mediano");
		producto.setPrecioxuni(15.0);
		producto.setStock(100);
		producto.setEstado("En Stock");
		producto.setCodigorespuesta("00");
		Producto p = productoRepositorio.save(producto);
		Assert.assertNotNull(p);
	}


	@Test
	public void testCliente(){
		Cliente cliente = new Cliente();
		cliente.setNombres("Gabriel");
		cliente.setApellidos("Ramos Zapata");
		cliente.setDni("74988388");
		cliente.setRazonsocial("UPC");
		cliente.setRuc("20904738745");
		cliente.setDireccion("Av. Escardo 1245");
		cliente.setTippersona("Persona Natural");
		cliente.setEmail("u201517459@upc.edu.pe");
		cliente.setTelefono("998673278");
		Cliente c = clienteRepositorio.save(cliente);
		Assert.assertNotNull(c);
	}





}
