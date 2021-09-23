package co.edu.unbosque.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.unbosque.model.Clientes;

public interface ClientesDAO extends JpaRepository <Clientes, Long>{

}
