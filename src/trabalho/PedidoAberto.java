package trabalho;

public class PedidoAberto implements EstadoCompra {
	
	ControleLoja controle;
	public PedidoAberto(ControleLoja novoControle) {
		controle = novoControle;
	}
	@Override
	public void Cancelar() {
		// TODO Auto-generated method stub
		System.out.println("Pedido ser� cancelado");
		controle.isPedidoAberto = false;
		controle.setEstadoCompra(controle.getEstadoCancelado());
	}

	@Override
	public void Pagar() {
		// TODO Auto-generated method stub
		System.out.println("Pedido ser� pago");
		controle.isPedidoAberto = false;
		controle.setEstadoCompra(controle.getEstadoPago());
	}

}
