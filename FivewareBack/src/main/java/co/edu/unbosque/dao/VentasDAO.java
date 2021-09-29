package co.edu.unbosque.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.unbosque.model.Ventas;

public interface VentasDAO extends JpaRepository<Ventas, Long>{

}
