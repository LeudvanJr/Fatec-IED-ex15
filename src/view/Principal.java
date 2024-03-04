package view;

import java.util.Scanner;
import controller.OperacoesController;

public class Principal {

	public static void main(String[] args) {
		
		OperacoesController opController = new OperacoesController();
		Scanner in = new Scanner(System.in);
		int posicao;
		
		do {
			System.out.println("Digite uma posição entre 1-20:");
			posicao = in.nextInt();
		} while (posicao<=0||posicao>20);
		
		System.out.println(opController.fibonacci(posicao));
		
	}

}
