package usuario.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import usuario.domain.UsuarioStatus;
import usuario.domain.UsuarioStatusProjection;

@RestController
@RequestMapping(path="/api")
public class UsuarioStatusController {

	@GetMapping(path="/status")
	public @ResponseBody List<UsuarioStatusProjection> getStatus() {
		ArrayList<UsuarioStatusProjection> list = new ArrayList<UsuarioStatusProjection>();
		for (UsuarioStatus u : UsuarioStatus.values()) {
			list.add(new UsuarioStatusProjection(
					u.name(), u.getStatus()));
		}
		return list; 
	}
}
