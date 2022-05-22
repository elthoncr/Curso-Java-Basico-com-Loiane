package com.loiane.cursojava.aula31;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		
		carro1.marca = "Fiat";
		
		System.out.println(carro1.calcularCombustivel(10));
		
		
	}
	
	
}
