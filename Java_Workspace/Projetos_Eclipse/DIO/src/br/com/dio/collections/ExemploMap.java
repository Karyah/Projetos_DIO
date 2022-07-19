package br.com.dio.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ExemploMap {
	
	public static void main(String[] args) {
		
		/*Maneiras de iniciar um Map:
		 * 
		 * Map carrosPopulares2020 = new HashMap();
		Map<String, Double> carrosPopulares = new HashMap<>();
		HashMap<String, Double> carrosPopulares2 = new HashMap<>();
		Map<String, Double> carrosPopulares3 = Map.of("gol",14.4,"uno",15.6);*/
		
		System.out.println("Crie um dicionário que relacione os modelos e seus respectivos");
		Map<String, Double> carrosPopulares = new HashMap<>() {{
			put("gol",14.4);
			put("uno",15.6);
			put("mobi",16.1);
			put("hb20",14.5);
			put("kwid",15.6);
		}};/*tipo da chave e tipo de valor*/
		System.out.println(carrosPopulares.toString());
		
		/*Substitua o consumo do gol por 15,2 km/l:*/
		carrosPopulares.put("gol", 15.2);
		System.out.println(carrosPopulares);/*tem como alterar, sobrescrever*/
		
		/*Confira se omodelo tucson está no dicionário:*/
		System.out.println(carrosPopulares.containsKey("tucson"));
		
		System.out.println(carrosPopulares.containsKey("uno"));
		 
		/*Exiba o valor da chave*/
		
		System.out.println("Exiba o valor da chave: "+carrosPopulares.get("uno"));
		
		System.out.println("Exiba a key(modelo): "+carrosPopulares.keySet());
		
		System.out.println("Exiba o valor(consumo): "+carrosPopulares.values());
		
		System.out.println("Retorne o maior valor de uma chave: "
		+Collections.max(carrosPopulares.values()));
		Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
		Set<Map.Entry<String,Double>> entries = carrosPopulares.entrySet();
		
		String modeloMaisEficiente = "";
		
		for(Map.Entry<String,Double>entry: entries) {
			if(entry.getValue().equals(consumoMaisEficiente)) {
				modeloMaisEficiente = entry.getKey();
			}
			
		}
			
		
				
		System.out.println("Retorne ");
		
		
	}
	
}
