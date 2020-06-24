package trabalho;

public class PedidoCancelado implements EstadoCompra {
	ControleLoja controle;
	public PedidoCancelado(ControleLoja novoControle) {
		controle = novoControle;
	}
	@Override
	public void Cancelar() {
		// TODO Auto-generated method stub
		System.out.println("Pedido já foi cancelado");
		controle.setEstadoCompra(controle.getEstadoCancelado());
	}

	@Override
	public void Pagar() {
		// TODO Auto-generated method stub
		System.out.println("Pedido cancelado");
		controle.setEstadoCompra(controle.getEstadoCancelado());
	}

}
