package br.com.dio.loop;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		int numero;
		int maior = 0;
		int cont = 0;
		int soma = 0;
		
		while(cont<=4) {
			System.out.println("N�mero: ");
			numero = ent.nextInt();
			if(numero > maior) maior = numero;
			cont++;
			soma = soma + numero;
		}
		
		System.out.println("Maior n�mero: " + maior);
		System.out.println("M�dia dos n�meros: " + soma/5);
		
	}
	
}
