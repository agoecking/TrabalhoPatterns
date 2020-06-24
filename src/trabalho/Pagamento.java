package trabalho;

public abstract class Pagamento {
	Divida statusDivida;
	
	public void Pagar() {
		statusDivida.setPaga(true);
	}
}
