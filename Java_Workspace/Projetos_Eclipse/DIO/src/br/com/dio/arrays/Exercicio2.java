package br.com.dio.arrays;

import java.util.Scanner;

/*Faça um programa que leia um vetor de 6 caracteres, e diga quantas consoantes
 * foram lidas. Imprima as consoantes.*/

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		String[] consoantes = new String[6];
		
		int quantidadeConsoantes = 0;
		int cont = 0;
		
		do {
			System.out.println("Letra: ");
			String letra = ent.next();
			
			if(!(letra.equalsIgnoreCase("a")|letra.equalsIgnoreCase("e")|letra.equalsIgnoreCase("i")|
					letra.equalsIgnoreCase("o")|letra.equalsIgnoreCase("u"))) {
			consoantes[cont] = letra;
			quantidadeConsoantes++;
			}
			cont++;
			}while(cont < consoantes.length); 
		
		for(String consoante : consoantes) {
			if(consoante!=null) 
				System.out.println("consoante: "+ consoante);
			
		}
		/*Para cada elemento dentro deste array consoantes, eu quero que vc imprima essa variavel. */
		

	}
}

