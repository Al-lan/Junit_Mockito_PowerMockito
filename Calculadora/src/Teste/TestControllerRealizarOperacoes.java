package Teste;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.spy;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import hud.com.Controller;
import hud.com.Principal;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Principal.class)
public class TestControllerRealizarOperacoes {

	private Controller controle;

	@Before
	public void antes() {
		MockitoAnnotations.initMocks(this);

		PowerMockito.suppress(PowerMockito.method(Principal.class, "tela"));
	}

	@Test
	public void teste() {
		/**
		 * Mensagem correta da opera��o somar 
		 * 
		 * Pr�-condi��es: Chamar o metodo realizarOpera�a� e passando 1 como
		 * parametro
		 * 
		 * Caixa preta.
		 * O teste tem como objetivo testar se a fun��o exibe na
		 * tela a mensagem correspondente a opera��o 1
		 * 
		 * Entradas: 1 
		 * Sa�da esperada: Digite os numeros que vc quer somar
		 * 
		 * P�s-condi��es: o metodo exibe a mensagem da opera�a� somar 
		 * 
		 **/
		ByteArrayInputStream in = new ByteArrayInputStream("5\n5\n".getBytes());

		ByteArrayOutputStream bt = new ByteArrayOutputStream();
		System.setOut(new PrintStream(bt));

		// inputs necess�rios para proseguir com o teste
		System.setIn(in);

		controle = spy(new Controller());
		doNothing().when(controle).somar(anyInt(), anyInt());

		controle.realizarOperacao(1);

		String resultadoAtual = bt.toString();
		String resultadoEsperado = "Digite os numeros que vc quer somar\r\n";

		Assert.assertEquals(resultadoAtual, resultadoEsperado);
	}

	@Test
	public void teste1() {
		/**
		 * Mensagem de erro
		 * 
		 * Pr�-condi��es: Chamar o metodo realizaropera��o e passar uma int
		 * desconhecida como parametro
		 * 
		 * Caixa branca. 
		 * O teste tem como objetivo testar se o metodo ao receber
		 * um parametro desconhecido exibe na tela a mensagem de erro vista no
		 * codigo
		 * 
		 * Entradas: 8 
		 * Saida esperada: tipo desconhecido! Baseado na linguagem
		 * deve haver algum erro de manipula��o aqui, talvez uma exce��o
		 * 
		 * P�s-condi��es: o metodo exibe a mensagem de erro
		 * 
		 **/
		ByteArrayOutputStream bt = new ByteArrayOutputStream();
		System.setOut(new PrintStream(bt));

		controle = spy(new Controller());
		controle.realizarOperacao(8);

		String resultadoAtual = bt.toString();
		String resultadoEsperado = "tipo desconhecido! Baseado na linguagem\n"
				+ " deve haver algum erro de manipula��o\n" + "aqui, talvez uma exce��o\r\n";

		Assert.assertEquals(resultadoAtual, resultadoEsperado);

	}
	
}
