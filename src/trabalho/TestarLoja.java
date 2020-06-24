//Alunos: Albrecht Goecking e Alan Achy
//Modelagem e Orienta��o a Objetos
//
//AVISO: O teste cont�m duas op��es que dever�o ser testadas comentando uma ou a outra
//
//OBJETIVO: O trabalho busca exemplificar de forma objetiva um State Machine constru�do sob o
//padr�o GoF, utilizando bases de Orienta��o a Objetos do Padr�o GRASP, como Polymorphism
//e Low Coupling
//
//Exemplos espec�ficos desses padr�es podem ser encontrados na Interface "EstadoCompra"
//que, com uso de polimorfismo, estrutura os estados da m�quina. Essa por sua vez, � 
//constru�da em baixo acoplamento, evitando que um objeto tenha grande interferencia em outro.


package trabalho;

public class TestarLoja {

	public static void main(String[] args) {
		
		ControleLoja controle = new ControleLoja();
		
		//teste 1
		
		controle.Pagar();
		
		controle.Cancelar();
		
		//---
		
		//teste 2
		
		controle.Cancelar();
		
		controle.Pagar();
	}

}
