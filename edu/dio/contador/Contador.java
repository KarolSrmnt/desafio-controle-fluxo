package edu.dio.contador;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import edu.dio.exception.ParametrosInvalidosException;

public class Contador {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		int parametroUm = 0;
		int parametroDois = 0;
			
		try {
			parametroUm = solicitarDados("Digite o primeiro parâmetro: ", input);
			parametroDois = solicitarDados("Digite o segundo parâmetro: ", input);
		} catch (InputMismatchException e) {
			System.out.println("Valor inválido. Por favor, digite um número inteiro.");
		}
		
		try {
			contar(parametroUm, parametroDois);
		} catch (ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
		}

	}
	
	static int solicitarDados(String mensagem, Scanner input) {
		System.out.print(mensagem);
		return input.nextInt();
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		
		if(parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();
		}
		
		int contagem = parametroDois - parametroUm;
		
		for(int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo o número " + i);
		}
	}
	
}
