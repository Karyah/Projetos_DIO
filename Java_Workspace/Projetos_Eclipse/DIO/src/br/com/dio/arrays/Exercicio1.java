package br.com.dio.arrays;

public class Exercicio1 {
	
	public static void main(String[] args) {
		/*como iniciar:*
		*Primeiramente, temos que declarar o tipo dos elementos que v�o estar
		* nesse array. S� PODEM EXISTIR ELEMENTOS DE UM MESMO TIPO OK*
		*falar o tipo, colocar [] pra indicar que � um arry, nome�-lo*/
		
		int [] vetor = {0, -5, 15, 50, 8, 4};
		
		/*Foi declarado um vetor unidimensional. Setado com os elementos dentro.
		 * Come�a na posi��o 0. Neste Array, existem 5 posi��es de 0 a 5. Existem 
		 * 6 elementos pq o 0 conta. */
		
		
		System.out.println(vetor);/*mostra onde esta o array na m�quina*/
		
		/*usaremos loops.(normalmente � o for each, mas teremos outro exemplos antes)
		 * O lenght retorna o tamanho certo do array. mas o tamanho dele, que �
		 * a quantidade de elementos do vetor. Mas pra navegar, n�o existe a posi��o
		 * 6 no vetor. A posi��o 6 n�o existe, ent�o no contador, queremos que ele 
		 * percorra o array -1. */
		
		int cont = 0;
		while(cont <= (vetor.length-1)) {
			System.out.println(vetor[cont]);
			cont++;
			/*quando o programa iniciar, o contador � 0. vai mostrar o vetor na posi��o
			 * 0*/
			
			/*tamb�m da pra deixar cont < vetor.lenght. pq ele n vai contar o ultimo ne*/
		}
		
		/*colocar em ordem inversa:*/
		for(int i = (vetor.length - 1); i>=0; i--) {
			System.out.println(vetor[i] +  "");
		}
		
	}
	
}
