package br.com.dio.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExemploList {
	
	public static void main(String[] args) {
		/*List notas1 = new ArrayList(); //antes do java 5
		List<Double> notas2 = new ArrayList(); //jdk 5 */
		
		
		
		List<Double> notas = new ArrayList<Double>();//jdk 7 ou <>
		notas.add(7d);
		notas.add(8.5);
		notas.add(9.3);
		notas.add(5d);
		notas.add(0d);
		notas.add(3.6);
		System.out.println(notas);
		System.out.println(notas.toString());
		
		
		
		/*List<Double> notas4 = new ArrayList<>(Arrays.asList(7d, 8.5, 9.4, 5d));/*elementos p add
		List<Double> notas5 = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);/*limitada. n pode add mais elementos na list ou retirar
		List<Double> notas6 = List.of(4.6, 5.3, 4.5, 56d, 12d, 4.5, 89d);/*tbm n pode add ou remover*/
	
	}
	
	

}
