package co.edu.unbosque.api;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbosque.dao.ProductosDAO;
import co.edu.unbosque.model.Productos;
import co.edu.unbosque.model.Usuarios;


@RestController
@RequestMapping("productos")
public class ProductosAPI {

	@Autowired
	private ProductosDAO productosDao;

	@PostMapping("/guardar")
	public void guardar(@RequestBody Productos productos) {
		productosDao.save(productos);
	}
	@GetMapping("/listar")
	public List<Productos> listar() {
		return productosDao.findAll();
	}
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Long id) {
		productosDao.deleteById(id);
	}
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Productos productos) {
		productosDao.save(productos);
	}
}
