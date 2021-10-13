package co.edu.unbosque.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import co.edu.unbosque.model.Ventas;
import co.edu.unbosque.dto.ConsecutivoDTO;

public interface VentasDAO extends JpaRepository<Ventas, Long>{

	@Query("select new co.edu.unbosque.dto.ConsecutivoDTO(ifnull(max(v.codigo_venta),0)+1) from Ventas v")
	Optional<ConsecutivoDTO> obtenerConsecutivo();
}
