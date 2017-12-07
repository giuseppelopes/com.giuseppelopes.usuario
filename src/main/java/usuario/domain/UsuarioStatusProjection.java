package usuario.domain;

import java.io.Serializable;

public class UsuarioStatusProjection implements Serializable {

	private static final long serialVersionUID = -2870931236777290609L;

	private String chave;
	
	private String valor;

	public UsuarioStatusProjection(String chave, String valor) {
		super();
		this.chave = chave;
		this.valor = valor;
	}

	public String getChave() {
		return chave;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
	
	
}
