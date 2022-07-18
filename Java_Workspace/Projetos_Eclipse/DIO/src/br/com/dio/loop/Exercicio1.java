package br.com.dio.loop;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		String nome;
		int idade;
	
		while(true) {
			System.out.println("Nome: ");
			nome = ent.next();
			System.out.println("Idade: ");
			idade = ent.nextInt();
			if(nome.equals("0")) {
				break;
			}
		}
		
	}
	
}
