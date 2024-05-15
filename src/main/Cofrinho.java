package main;

import java.util.ArrayList;
import java.util.List;

import moedas.Moeda;

public class Cofrinho {
	
	List<Moeda> listaMoedas = new ArrayList<>();
	
	public void adicionar(Moeda moeda) {
		listaMoedas.add(moeda);
	}
	
	public void remover(Moeda moeda) {
		listaMoedas.remove(moeda);
	}
	
	public void listagemMoedas() {
		if (listaMoedas.isEmpty()) {
			System.out.println("O cofrinho está vazio!");
		}
		else {
			for (Moeda moeda : listaMoedas) {
				moeda.info();
			}
		}
	}
	
	public double totalConvertido() {
		if(listaMoedas.isEmpty()) {
			return 0;
		}
		
		double soma = 0;
		for (Moeda moeda : listaMoedas) {
			soma = soma + moeda.converter();
		}
		return soma;
	}
	
}