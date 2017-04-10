package hud.com;

import java.util.Scanner;

public class Controller {

	Scanner sc = new Scanner(System.in);
	Principal tela1 = new Principal();

	public void somar(int x, int y) {
		System.out.println(x + y);
	}

	public void somar(double x, double y) {
		System.out.println(x + y);
	}

	public void subtrair(int x, int y) {
		System.out.println(x - y);
	}

	public void subtrair(double x, double y) {
		System.out.println(x - y);
	}

	public void multiplicar(int x, int y) {
		System.out.println(x * y);
	}

	public void multiplicar(double x, double y) {
		System.out.println(x * y);
	}

	public void dividir(int x, int y) {
		if (y != 0) {
			System.out.print(x / y);
			if (x % y != 0) {
				System.out.println(" e sobra " + x % y);
			}
			System.out.println("");
		} else {
			System.out.println("nenhum numero pode ser dividido por 0");
		}
	}

	public void validar(int valor) {
		if (valor > 5) {
			System.out.println("numero invalido");
			tela1.tela();
			valor = sc.nextInt();
			validar(valor);
		} else {
			realizarOperacao(valor);
		}
	}

	public void realizarOperacao(int x) {
		int a;
		int b;
		switch (x) {
		case 1:
			System.out.println("Digite os numeros que vc quer somar");
			a = sc.nextInt();
			b = sc.nextInt();
			somar(a, b);
			tela1.tela();
			break;
		case 2:
			System.out.println("Digite os numeros que vc quer dividir");
			a = sc.nextInt();
			b = sc.nextInt();
			dividir(a, b);
			tela1.tela();
			break;

		case 3:
			System.out.println("Digite os numeros que vc quer multiplicar");
			a = sc.nextInt();
			b = sc.nextInt();
			multiplicar(a, b);
			tela1.tela();
			break;
		case 4:
			System.out.println("Digite os numeros que vc quer subtração");
			a = sc.nextInt();
			b = sc.nextInt();
			subtrair(a, b);
			tela1.tela();
			break;
		case 5:
			System.out.println("É HORA DE DAR TCHAU....");
			break;
		default:
			System.out.println("tipo desconhecido! Baseado na linguagem\n" + " deve haver algum erro de manipulação\n"
					+ "aqui, talvez uma exceção");

		}
	}
}