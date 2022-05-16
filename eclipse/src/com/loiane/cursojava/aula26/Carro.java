package com.loiane.cursojava.aula26;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros; //número de passageiros
	double capCombustivel; //capacidade do tanque de combustível
	double consumoCombustivel; //consumo de combustível por km
	
	//Por boas práticas, os metodos das classes em java sempre começa com a primeira palavra sendo um Verbo
	
	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + "km");
	}
	
	double obterAutonomia() {
		
		System.out.println("Método obterAutonomia foi chamado.");
		
			return capCombustivel * consumoCombustivel;
	}
	
}
