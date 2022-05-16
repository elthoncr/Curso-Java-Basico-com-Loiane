package com.loiane.cursojava.aula26;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros; //n�mero de passageiros
	double capCombustivel; //capacidade do tanque de combust�vel
	double consumoCombustivel; //consumo de combust�vel por km
	
	//Por boas pr�ticas, os metodos das classes em java sempre come�a com a primeira palavra sendo um Verbo
	
	void exibirAutonomia() {
		System.out.println("A autonomia do carro �: " + capCombustivel * consumoCombustivel + "km");
	}
	
	double obterAutonomia() {
		
		System.out.println("M�todo obterAutonomia foi chamado.");
		
			return capCombustivel * consumoCombustivel;
	}
	
}
