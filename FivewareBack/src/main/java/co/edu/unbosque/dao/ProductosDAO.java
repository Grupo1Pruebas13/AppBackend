package co.edu.unbosque.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import co.edu.unbosque.model.Productos;

public interface ProductosDAO extends JpaRepository<Productos, Long>{

}
