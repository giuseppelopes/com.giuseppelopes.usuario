package usuario.repository;

import org.springframework.data.repository.CrudRepository;

import usuario.domain.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long>  {
}
