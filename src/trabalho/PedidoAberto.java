package trabalho;

public class PedidoAberto implements EstadoCompra {
	
	@Override
	public void Cancelar(ControleLoja controle) {

		System.out.println("Pedido foi cancelado");
		controle.setEstadoCompra(new PedidoCancelado());
	}

	@Override
	public void Pagar(ControleLoja controle) {

		System.out.println("Pedido será pago");
		controle.setEstadoCompra(new PedidoPago());
	}

}
