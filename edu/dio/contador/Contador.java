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
			System.out.print("Digite o primeiro parâmetro: ");
			parametroUm = input.nextInt();
			System.out.print("Digite o segundo parâmetro: ");
			parametroDois = input.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Valor inválido. Por favor, digite um número inteiro.");
		}
		
		try {
			contar(parametroUm, parametroDois);
		} catch (ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
		}

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
