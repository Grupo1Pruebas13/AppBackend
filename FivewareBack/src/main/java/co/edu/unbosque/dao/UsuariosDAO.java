package co.edu.unbosque.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import co.edu.unbosque.model.Usuarios;

public interface UsuariosDAO extends JpaRepository<Usuarios, Integer> {

}
