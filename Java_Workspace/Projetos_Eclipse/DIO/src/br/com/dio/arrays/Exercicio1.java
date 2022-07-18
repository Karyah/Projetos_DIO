package br.com.dio.arrays;

public class Exercicio1 {
	
	public static void main(String[] args) {
		/*como iniciar:*
		*Primeiramente, temos que declarar o tipo dos elementos que vão estar
		* nesse array. SÓ PODEM EXISTIR ELEMENTOS DE UM MESMO TIPO OK*
		*falar o tipo, colocar [] pra indicar que é um arry, nomeá-lo*/
		
		int [] vetor = {0, -5, 15, 50, 8, 4};
		
		/*Foi declarado um vetor unidimensional. Setado com os elementos dentro.
		 * Começa na posição 0. Neste Array, existem 5 posições de 0 a 5. Existem 
		 * 6 elementos pq o 0 conta. */
		
		
		System.out.println(vetor);/*mostra onde esta o array na máquina*/
		
		/*usaremos loops.(normalmente é o for each, mas teremos outro exemplos antes)
		 * O lenght retorna o tamanho certo do array. mas o tamanho dele, que é
		 * a quantidade de elementos do vetor. Mas pra navegar, não existe a posição
		 * 6 no vetor. A posição 6 não existe, então no contador, queremos que ele 
		 * percorra o array -1. */
		
		int cont = 0;
		while(cont <= (vetor.length-1)) {
			System.out.println(vetor[cont]);
			cont++;
			/*quando o programa iniciar, o contador é 0. vai mostrar o vetor na posição
			 * 0*/
			
			/*também da pra deixar cont < vetor.lenght. pq ele n vai contar o ultimo ne*/
		}
		
		/*colocar em ordem inversa:*/
		for(int i = (vetor.length - 1); i>=0; i--) {
			System.out.println(vetor[i] +  "");
		}
		
	}
	
}
