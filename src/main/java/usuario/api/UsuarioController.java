package usuario.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import usuario.domain.Usuario;
import usuario.repository.UsuarioRepository;

@RestController
@RequestMapping(path="/api")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuarioRepositorio;
	
	@PostMapping(path="/add")
	@ResponseStatus(HttpStatus.CREATED)
	public @ResponseBody String addNewUser (@RequestParam String name
			, @RequestParam String email, @RequestParam String senha, @RequestParam String status) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request
		Usuario usuario = new Usuario();
		usuario.setNome(name);
		usuario.setEmail(email);
		usuario.setSenha(senha);
		usuario.setStatus(Integer.getInteger(status));
		usuarioRepositorio.save(usuario);
		return "Saved";
	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<Usuario> getAllUsers() {
		// This returns a JSON or XML with the users
		return usuarioRepositorio.findAll();
	}
}
