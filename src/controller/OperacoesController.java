package controller;

public class OperacoesController {
	public OperacoesController() {
		// TODO Auto-generated constructor stub
	}
	
	//Funcao que retorna o valor de uma posicao na sequencia Fibonacci
	public int fibonacci(int pos) {
		
		//Os menores termos conhecidos sao o 1º e 2º 
		if(pos==1 || pos==2)
			return 1;
		
		//A funcao caminha para um estado anterior do problema
		return fibonacci(pos-1) + fibonacci(pos-2);
	}
}
