package br.com.dio.arrays;

import java.util.Random;

/*Gere e imprima uma matriz M 4x4 com valors aleatórios entre 0-9*/

public class Exercicio4 {

	public static void main(String[] args) {
		Random random = new Random();
		int[][] M = new int[4][4];
		
		for(int i = 0; i < M.length; i++) {
			for(int j = 0; j < M[i].length; j++) {
				M[i][j] = random.nextInt(9);
			}
		}
		
		/*j representa coluna nessa linha. j vai ser maior do que essa linha que
		a gente está percorrendo.*/
		
		for(int[] linha :M) {
			for(int elementoDaColuna: linha) {
				System.out.print(elementoDaColuna + " ");
			}
			System.out.println();
		}
		
		
	}
	
}
