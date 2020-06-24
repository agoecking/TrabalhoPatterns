package trabalho;

public class PedidoPago implements EstadoCompra {
	
	ControleLoja controle;
	public PedidoPago(ControleLoja novoControle) {
		controle = novoControle;
	}
	@Override
	public void Cancelar() {
		System.out.println("Pedido j� foi pago");
		controle.setEstadoCompra(controle.getEstadoPago());
	}

	@Override
	public void Pagar() {
		System.out.println("Pagamento j� computado");
		controle.setEstadoCompra(controle.getEstadoPago());
	}

}
