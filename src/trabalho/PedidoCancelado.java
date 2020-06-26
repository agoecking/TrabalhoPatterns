package trabalho;

public class PedidoCancelado implements EstadoCompra {

	@Override
	public void Cancelar(ControleLoja controle) {

		System.out.println("Pedido já foi cancelado");
	}

	@Override
	public void Pagar(ControleLoja controle) {

		System.out.println("Pedido foi cancelado e não pode ser pago");
	}

}
