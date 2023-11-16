package prjLombok.lombok.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import prjLombok.lombok.entities.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{
	
	}