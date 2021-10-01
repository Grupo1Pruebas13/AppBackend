package co.edu.unbosque.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbosque.dao.Detalle_ventasDAO;
import co.edu.unbosque.model.Detalle_ventas;

@RestController 
@RequestMapping("detalle_ventas")
public class Detalle_ventasAPI {
	@Autowired
	private Detalle_ventasDAO detalle_ventasDao;
	
	@PostMapping("/guardar")
	public void guardar(@RequestBody Detalle_ventas detalle_ventas){
		detalle_ventasDao.save(detalle_ventas);
	}

}
