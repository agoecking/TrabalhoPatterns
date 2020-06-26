package trabalho;

public class ControleLoja {
	
	EstadoCompra estado;
	
	
	public ControleLoja(EstadoCompra estado) {
	
		this.estado = estado;
	}
	
	void setEstadoCompra(EstadoCompra novoEstado) {
		estado = novoEstado;
	}
	
	public void Pagar() {
		estado.Pagar(this);
	}
	
	public void Cancelar() {
		estado.Cancelar(this);
	}
}
