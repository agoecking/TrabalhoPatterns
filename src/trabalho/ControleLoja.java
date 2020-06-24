package trabalho;

public class ControleLoja {
	
	EstadoCompra pedidoAberto;
	EstadoCompra pedidoPago;
	EstadoCompra pedidoCancelado;
	
	EstadoCompra estado;
	
	boolean isPedidoAberto = true;
	
	public ControleLoja() {
		pedidoAberto = new PedidoAberto(this);
		pedidoPago = new PedidoPago(this);
		pedidoCancelado = new PedidoCancelado(this);
		
		estado = pedidoAberto;
	}
	
	void setEstadoCompra(EstadoCompra novoEstado) {
		estado = novoEstado;
	}
	
	public void Pagar() {
		estado.Pagar();
	}
	
	public void Cancelar() {
		estado.Cancelar();
	}
	
	public EstadoCompra getEstadoAberto() {
		return pedidoAberto;
	}
	
	public EstadoCompra getEstadoPago() {
		return pedidoPago;
	}
	
	public EstadoCompra getEstadoCancelado() {
		return pedidoCancelado;
	}
}
