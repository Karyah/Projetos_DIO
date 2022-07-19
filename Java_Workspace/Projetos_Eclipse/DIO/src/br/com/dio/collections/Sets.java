package br.com.dio.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
	
	public static void main(String[] args) {
		System.out.println("Séries em ordem aleatória:");
		
		Set<Serie> minhasSeries = new HashSet<>() {{
			add(new Serie("got","fantasia",60));
			add(new Serie("dark","drama",60));
			add(new Serie("full house","comédia",25));
		}};
		
		for(Serie serie:minhasSeries) System.out.println("nome: "+ serie.getNome()+" genero: "+serie.getGenero()+" "
				+ "tempo episódio: "+serie.getTempoEpisodio());
		
		
		System.out.println("Séries na ordem de inserção:");
		Set<Serie> minhasSeries2 = new LinkedHashSet<>() {{
			add(new Serie("got","fantasia",60));
			add(new Serie("dark","drama",60));
			add(new Serie("full house","comédia",25));
		}};
		for(Serie serie:minhasSeries2) System.out.println("nome: "+ serie.getNome()+" genero: "+serie.getGenero()+" "
				+ "tempo episódio: "+serie.getTempoEpisodio());
		
		
		System.out.println("Ordem Natural");
		Set<Serie> minhasSeriesOrdemNatural = new TreeSet<>(minhasSeries);
		System.out.println(minhasSeriesOrdemNatural);
		
		System.out.println("Ordem Nome/Gênero/Tempo Ep");
		
		Set<Serie> minhasSeriesOrganizadas = new TreeSet<>(new ComparatorNomeGeneroTempo());
		
		minhasSeriesOrganizadas.addAll(minhasSeries);
		for(Serie serie: minhasSeriesOrganizadas) System.out.println("Nome: "+serie.getNome()+"   Gênero: "+serie.getGenero() +
				"Tempo de Episódio: " + serie.getTempoEpisodio());
	
	}
}










class Serie implements Comparable<Serie>{
	private String nome;
	private String genero;
	private Integer tempoEpisodio;
	
	public Serie(String nome, String genero, Integer tempoEpisodio) {
		this.nome=nome;
		this.genero=genero;
		this.tempoEpisodio= tempoEpisodio;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public Integer getTempoEpisodio() {
		return tempoEpisodio;
	}
	
	public void setTempoEpisodio(Integer tempoEpisodio) {
		this.tempoEpisodio = tempoEpisodio;
	}
	@Override
	public String toString() {
		return "[nome=" + nome + ", genero=" + genero + ", tempoEpisodio=" + tempoEpisodio + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(genero, nome, tempoEpisodio);
	}
	
	@Override/*verifica se o  objeto q estamos pesquisando tem o hash code dentro da classe*/
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Serie other = (Serie) obj;
		return Objects.equals(genero, other.genero) && Objects.equals(nome, other.nome)
				&& Objects.equals(tempoEpisodio, other.tempoEpisodio);
	}

	@Override
	public int compareTo(Serie serie) {
		int TempoEpisodio = Integer.compare(this.getTempoEpisodio(),serie.getTempoEpisodio());
		if (tempoEpisodio!=0) return tempoEpisodio;
		return this.getGenero().compareTo(serie.getGenero());
		// TODO Auto-generated method stub
		/*return Integer.compare(this.getTempoEpisodio(),serie.tempoEpisodio);*/
		
	}
	
	
}