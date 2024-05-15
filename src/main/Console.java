package main;

import java.util.Scanner;

import moedas.Dolar;
import moedas.Euro;
import moedas.Real;

public class Console {
	
	Scanner sc = new Scanner(System.in);
	Cofrinho cofrinho = new Cofrinho();
	
	public void menuAdicionarMoeda() {
		
	}
	public void exibirMenu() {
		System.out.println("COFRINHO:");
		System.out.println("1 - Adicionar moeda");
		System.out.println("2 - Remover moeda");
		System.out.println("3 - Listar moedas");
		System.out.println("4 - Calcular total convertido para real");
		System.out.println("0 - Encerrar");
		
		int opcao = sc.nextInt();
		
		switch(opcao) {
		case 0:
			System.out.println("Programa encerrado.");
			break;
		case 1:
			System.out.println("Escolha a moeda:");
			System.out.println("1 - Real");
			System.out.println("2 - Dolar");
			System.out.println("3 - Euro");
			
			int selecionarMoeda = sc.nextInt();
			System.out.println("Digite o valor:");
			double valor = sc.nextDouble();
			
			//Adiciona uma moeda na lista
			if(selecionarMoeda == 1)  {
				cofrinho.adicionar(new Real(valor));
			}
			if(selecionarMoeda == 2) {
				cofrinho.adicionar(new Dolar(valor));
			}
			if(selecionarMoeda == 3) { 
				cofrinho.adicionar(new Euro(valor));
			}
			exibirMenu();
			break;	
		case 2:
			System.out.println("Escolha a moeda:");
			System.out.println("1 - Real");
			System.out.println("2 - Dolar");
			System.out.println("3 - Euro");
			
			int tipoMoeda = sc.nextInt();
			System.out.println("Digite o valor:");
			double valorMoeda = sc.nextDouble();
			
			//Remove uma moeda da lista
			if(tipoMoeda == 1)  {
				cofrinho.remover(new Real(valorMoeda));
			}
			if(tipoMoeda == 2) {
				cofrinho.remover(new Dolar(valorMoeda));
			}
			if(tipoMoeda == 3) { 
				cofrinho.remover(new Euro(valorMoeda));
			}
			exibirMenu();
			break;
		case 3:
			//Lista todas as moedas da lista
			cofrinho.listagemMoedas();
			exibirMenu();
			break;
		case 4:
			//Converte todas as moedas da lista para real
			System.out.println("O total convertido para real é: " + cofrinho.totalConvertido());
			exibirMenu();
			break;
			}	
		}	
	}
	
