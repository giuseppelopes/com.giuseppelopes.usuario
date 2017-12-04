package usuario.repository;

import org.springframework.data.repository.CrudRepository;

import usuario.entity.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long>  {
}
