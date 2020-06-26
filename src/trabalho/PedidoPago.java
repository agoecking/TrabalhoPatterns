package trabalho;

public class PedidoPago implements EstadoCompra {
	
	@Override
	public void Cancelar(ControleLoja controle) {
		
		System.out.println("Pedido j� foi pago e n�o pode ser cancelado");
		
	}

	@Override
	public void Pagar(ControleLoja controle) {
		
		System.out.println("Pagamento j� processado");
		
	}

}
