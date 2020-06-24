//Alunos: Albrecht Goecking e Alan Achy
//Modelagem e Orientação a Objetos
//
//AVISO: O teste contém duas opções que deverão ser testadas comentando uma ou a outra
//
//OBJETIVO: O trabalho busca exemplificar de forma objetiva um State Machine construído sob o
//padrão GoF, utilizando bases de Orientação a Objetos do Padrão GRASP, como Polymorphism
//e Low Coupling
//
//Exemplos específicos desses padrões podem ser encontrados na Interface "EstadoCompra"
//que, com uso de polimorfismo, estrutura os estados da máquina. Essa por sua vez, é 
//construída em baixo acoplamento, evitando que um objeto tenha grande interferencia em outro.


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
