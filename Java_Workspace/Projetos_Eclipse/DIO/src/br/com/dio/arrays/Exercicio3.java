package br.com.dio.arrays;

import java.util.Random;

/*Faça um programa que leia 20 números inteiros (entre 0 e 100) e armazene-os num vetor.
 * Ao final, mostre os números e seus sucessores*/

public class Exercicio3 {
	
	public static void main(String[] args) {
		Random random = new Random(); /*essa classe gera numeros aleatorios*/
		int[] numerosAleatorios = new int[20];
		
		for(int i = 0; i < numerosAleatorios.length; i++) {
			int numero = random.nextInt(100);
			numerosAleatorios[i] = numero;
		}
		
		System.out.println("Números Aleatórios:");
		
		for(int numero : numerosAleatorios) {
			System.out.println(numero + "");
		}
		
		System.out.println("Sucessores dos Números Aleatórios:");
		
		for(int numero : numerosAleatorios) {
			System.out.println(++numero + "");
		}
		/*foreach é bom pra navegar dentro do vetor, imprimir algo e fazer algo
		EM CADA elemento. nao consigo ter acesso à posição especifica. cada laço tem suas
		vatangens/desvantagens. */
		
	}
	
}
