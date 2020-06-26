package trabalho;

public class PedidoCancelado implements EstadoCompra {

	@Override
	public void Cancelar(ControleLoja controle) {

		System.out.println("Pedido j� foi cancelado");
	}

	@Override
	public void Pagar(ControleLoja controle) {

		System.out.println("Pedido foi cancelado e n�o pode ser pago");
	}

}
