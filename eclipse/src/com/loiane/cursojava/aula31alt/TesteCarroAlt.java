package com.loiane.cursojava.aula31alt;

import com.loiane.cursojava.aula31.Carro;

public class TesteCarroAlt {

	public static void main(String[] args) {

		Carro carro1 = new Carro();
		
		carro1.marca = "Fiat";
		carro1.calcularCombustivel(10);
		carro1.calcularCombustivel(50);
		
	}

}
