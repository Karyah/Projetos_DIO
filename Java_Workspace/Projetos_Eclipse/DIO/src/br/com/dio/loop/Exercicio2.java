package br.com.dio.loop;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		int nota;

		System.out.println("Digite uma nota:");
		nota = ent.nextInt();
			
		while(nota<0||nota>10) {
			System.out.println("Nota inválida!");
			nota= ent.nextInt();
		}
			
		
		
		
	}

}
