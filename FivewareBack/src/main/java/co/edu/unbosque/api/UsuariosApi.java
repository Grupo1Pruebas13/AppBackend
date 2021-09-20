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

import co.edu.unbosque.dao.UsuariosDAO;
import co.edu.unbosque.model.Usuarios;

@RestController
@RequestMapping("usuarios")
public class UsuariosApi {

	@Autowired
	private UsuariosDAO usuarioDao;

	@PostMapping("/guardar")
	public void guardar(@RequestBody Usuarios usuarios) {
		usuarioDao.save(usuarios);
	}

	@GetMapping("/listar")
	public List<Usuarios> listar() {
		return usuarioDao.findAll();
	}

	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		usuarioDao.deleteById(id);
	}

	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Usuarios usuarios) {
		usuarioDao.save(usuarios);
	}
}
