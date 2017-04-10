package hud.com;

import java.util.Scanner;

public class Principal {

	public void tela(){
		Controller cal = new Controller();

		Scanner sc = new Scanner(System.in);
		int valor;
		System.out.println("[---------------------------]");
		System.out.println("[hud------------------------]");
		System.out.println("[---------CALCULADORA-------]");
		System.out.println("[---------------------------]");
		System.out.println("[DIGITE O NUMERO DA OPERAÇÃO]");
		System.out.println("[---------------------------]");
		System.out.println("[-1-SOMA--------------------]");
		System.out.println("[-2-DIVISÃO-----------------]");
		System.out.println("[-3-MULTIPLICAÇÃO-----------]");
		System.out.println("[-4-SUBTRAÇÃO---------------]");
		System.out.println("[-5-SAIR--------------------]");
		System.out.println("[---------------------------]");

		

		valor = sc.nextInt();
		cal.validar(valor);

		sc.close();
	}

}
