package Teste;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Assert;
import org.junit.Test;

import hud.com.Controller;

public class TesteController {

	@Test
	public void test1() {
		/**
		 * Divisão simples.
		 * 
		 * Pré-condições: Chamar o metodo dividir e passar duas ints como
		 * parametro.
		 * 
		 * Caixa preta. 
		 * O teste tem como objetivo saber se o metodo exibe na
		 * tela o resultado de uma divisão simples.
		 * 
		 * Entradas: 4 e 2 
		 * Saída esperada : 2
		 * 
		 * Pós-condições: O metodo exibe na tela o resultado da divisão.
		 * 
		 **/
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));

		Controller ct = new Controller();
		ct.dividir(4, 2);
		String actuals = out.toString();
		String expecteds = "2\r\n";
		Assert.assertEquals(expecteds, actuals);
	}

	@Test
	public void test2() {
		/**
		 * Divisão com sobra
		 * 
		 * Pré-condições: Chamar o metodo dividir e passar duas ints como
		 * parametro sendo o dividendo menor que o divisor.
		 * 
		 * Caixa preta. 
		 * O teste tem como objetivo saber se o metodo exibe na
		 * tela uma divisão com sobra.
		 * 
		 * Entradas: 7 e 8 
		 * Saída esperada: 0 e sobra 7
		 * 
		 * Pós-condições: O metodo exibe na tela o resultado da divisão e sua
		 * sobra
		 * 
		 **/
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));

		Controller ct = new Controller();
		ct.dividir(10, 4);
		String actuals = out.toString();

		String expecteds = "0 e sobra 7\r\n\r\n";
		Assert.assertEquals(actuals, expecteds);
	}

	@Test
	public void test3() {
		/**
		 * Divisão com números grandes.
		 * 
		 * Pré-condições: Chamar o metodo dividir e passar duas ints como
		 * parametro sendo uma maior que 10000.
		 * 
		 * Caixa preta. 
		 * O teste tem como objetivo saber se o metodo exibe na
		 * tela uma divisão com um numero maior que 10000.
		 * 
		 * Entradas: 10005 e 5 
		 * Saída esperada: 2001
		 * 
		 * Pós-condições: O metodo exibe na tela o resultado da divisão.
		 * 
		 **/
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));

		Controller ct = new Controller();
		ct.dividir(10005, 5);
		String actuals = out.toString();
		String expecteds = "2001\r\n";
		Assert.assertEquals(expecteds, actuals);
	}

	@Test
	public void test4() {
		/**
		 * Divisão com dividendo 0.
		 * 
		 * Pré-condições: Chamar o metodo dividir e passar duas ints como
		 * parametro sendo uma o 0.
		 * 
		 * Caixa preta.
		 * O teste tem como objetivo saber se o metodo exibe na
		 * tela uma divisão com o dividendo 0.
		 * 
		 * Entradas: 0 e 8 
		 * Saída esperada : 0
		 * 
		 * Pós-condições: O metodo exibe na tela o resultado da divisão.
		 * 
		 **/
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));

		Controller ct = new Controller();
		ct.dividir(0, 8);
		String actuals = out.toString();

		String expecteds = "0\r\n";
		Assert.assertEquals(expecteds, actuals);
	}

	@Test
	public void test5() {
		/**
		 * Divisão com 1 número negativo e sobra
		 * 
		 * Pré-condições: Chamar o metodo dividir e passar duas ints como
		 * parametro sendo o dividendo um negativo maior que o divisor.
		 * 
		 * Caixa preta. 
		 * O teste tem como objetivo saber se o metodo exibe na
		 * tela uma divisão com um número negativo e sobra
		 * 
		 * Entradas: -18 e 4 
		 * Saida esperada: -4 e sobra -2
		 * 
		 * Pós-condições: O metodo exibe na tela o resultado da divisão e sua
		 * sobra
		 * 
		 **/
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));

		Controller ct = new Controller();
		ct.dividir(-18, 4);
		String actuals = out.toString();
		String expecteds = "-4 e sobra -2\r\n\r\n";
		Assert.assertEquals(expecteds, actuals);
	}

	@Test
	public void test6() {
		/**
		 * Divisão com com disvisor 0
		 * 
		 * Pré-condições: Chamar o metodo dividir e passar duas ints sendo o
		 * divisor o 0.
		 * 
		 * Caixa branca. 
		 * Teste tem como objetivo testar a estrutura de decisão
		 * vista no codigo
		 * 
		 * Entradas: 8 e 0 
		 * Saida esperada: nenhum número pode ser dividido por 0
		 * 
		 * Pós-condições: o metodo exibe uma mensagem informando a
		 * impossibilidade da divisão
		 * 
		 **/
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));

		Controller ct = new Controller();
		ct.dividir(8, 0);
		String actuals = out.toString();
		String expecteds = "nenhum numero pode ser dividido por 0\r\n";
		Assert.assertEquals(expecteds, actuals);
	}
	
	
}
