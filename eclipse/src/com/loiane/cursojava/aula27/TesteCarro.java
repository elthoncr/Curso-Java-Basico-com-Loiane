package com.loiane.cursojava.aula27;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		van.exibirAutonomia();
		
		double autonomia = van.obterAutonomia();
		System.out.println("A autonomia do carro é: " + autonomia);
		System.out.println("A autonomia do carro é: " + van.obterAutonomia());
		
		double consumoCombustivel10 = van.calcularCombustivel(10);
		System.out.println("Consumo para rodar 10km é: " + consumoCombustivel10);
		
		double consumoCombustivel20 = van.calcularCombustivel(20);
		System.out.println("Consumo para rodar 20km é: " + consumoCombustivel20);
		
	}
}
