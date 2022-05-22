package com.loiane.cursojava.aula31;

public class Carro {
	
	public String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	private double consumoCombustivel;
	
	public Carro() {
		
	}

	public void exibirAutonomia() {
		System.out.println("A autonomia do carro e: " + this.capCombustivel * this.consumoCombustivel + "km");
	}
	
	public double obterAutonomia() {

		System.out.println("Metodo obterAutonomia foi chamado.");

		return this.capCombustivel * this.consumoCombustivel;
	}
	
	private double divideKMPorConsumoCombustivel (double km) {		
		return (km / this.consumoCombustivel);
	}

	public double calcularCombustivel(double km) {

		return this.divideKMPorConsumoCombustivel(km);

	}
	
}
