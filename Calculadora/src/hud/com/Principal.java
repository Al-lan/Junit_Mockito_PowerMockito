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
		System.out.println("[DIGITE O NUMERO DA OPERA��O]");
		System.out.println("[---------------------------]");
		System.out.println("[-1-SOMA--------------------]");
		System.out.println("[-2-DIVIS�O-----------------]");
		System.out.println("[-3-MULTIPLICA��O-----------]");
		System.out.println("[-4-SUBTRA��O---------------]");
		System.out.println("[-5-SAIR--------------------]");
		System.out.println("[---------------------------]");

		

		valor = sc.nextInt();
		cal.validar(valor);

		sc.close();
	}

}
