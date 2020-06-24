package trabalho;

public class PedidoPago implements EstadoCompra {
	
	ControleLoja controle;
	public PedidoPago(ControleLoja novoControle) {
		controle = novoControle;
	}
	@Override
	public void Cancelar() {
		System.out.println("Pedido já foi pago");
		controle.setEstadoCompra(controle.getEstadoPago());
	}

	@Override
	public void Pagar() {
		System.out.println("Pagamento já computado");
		controle.setEstadoCompra(controle.getEstadoPago());
	}

}
