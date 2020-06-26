package trabalho;

public class PedidoPago implements EstadoCompra {
	
	@Override
	public void Cancelar(ControleLoja controle) {
		
		System.out.println("Pedido já foi pago e não pode ser cancelado");
		
	}

	@Override
	public void Pagar(ControleLoja controle) {
		
		System.out.println("Pagamento já processado");
		
	}

}
