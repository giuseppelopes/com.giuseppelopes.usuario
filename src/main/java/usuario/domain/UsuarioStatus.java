package usuario.domain;

import java.io.Serializable;

public enum UsuarioStatus implements Serializable{
	PENDING ("Pendente"),
	ACTIVE ("Ativo");
	
	UsuarioStatus(String status)
	{
		this.status = status;
	}
	
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
