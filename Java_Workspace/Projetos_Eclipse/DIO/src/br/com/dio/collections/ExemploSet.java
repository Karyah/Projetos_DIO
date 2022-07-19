package br.com.dio.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet  {
	public static void main(String[] args) {

	Set<Double> notas = new HashSet<>(Arrays.asList(7d,5.6,8d,8.3,9.4,7d,3.4));
	System.out.println(notas.toString());
	/*Fica fora de ordem pq estamos trabalhando com HashSet*/
	
	/*Não da pra exibir posição.*/
	
	/*Não da pra adicionar em determinada posição*/
	
	/*Não da pra substituir notas*/
	
	/*Conferir se existe tal valor:*/
	System.out.println(notas.contains(5d));
	
	/*Ver valores máximos e mínimos:*/
	System.out.println("menor nota: "+Collections.min(notas));
	System.out.println("maior nota: "+Collections.max(notas));
	
	/*Ver soma dos valores:*/
	Iterator<Double> iterator = notas.iterator();
	Double soma = 0d;
	
	while(iterator.hasNext()) {
		Double next = iterator.next();
		soma += next;
	}
	
	System.out.println("soma: "+ soma);
	
	System.out.println("média: "+ soma/notas.size());
	
	notas.remove(7d);
	System.out.println(notas);
	
	/*Remova as notas menore que 7 e exiba:*/
	Iterator<Double> iterator2= notas.iterator();
	
	while(iterator2.hasNext()) {
		Double next = iterator2.next();
		if(next < 7) {
			iterator2.remove();
		}
	}
	System.out.println(notas);
	
	/*para mostrar em ordem:*/
	
	/*Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(7d,5.6,8d,8.3,9.4,7d,3.4));*/
	Set<Double> notas3 = new LinkedHashSet<>();
	notas3.add(7d);
	notas3.add(5.6);
	notas3.add(8d);
	notas3.add(8.3);
	notas3.add(9.4);
	notas3.add(7d);
	notas3.add(3.4);
	System.out.println(notas3);
	
	/*Ordem crescente:*//*só da certo pq é Double*/
	Set<Double> notasOrdemCrescente = new TreeSet<>(notas3);
	System.out.println(notasOrdemCrescente);
	
	notas3.clear();
	System.out.println(notas3.isEmpty());
	
	}
}
