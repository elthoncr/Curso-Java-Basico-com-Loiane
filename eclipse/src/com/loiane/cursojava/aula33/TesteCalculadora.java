package com.loiane.cursojava.aula33;

public class TesteCalculadora {

	public static void main(String[] args) {

		int vetNumerosInteiros[] = new int[5];

		// vetNumerosInteiros = new int[5];
		vetNumerosInteiros[0] = 1;
		vetNumerosInteiros[1] = 0;
		vetNumerosInteiros[2] = 1;
		vetNumerosInteiros[3] = 1;
		vetNumerosInteiros[4] = 1;
		vetNumerosInteiros[5] = 1;

		MinhaCalculadora calculadora = new MinhaCalculadora();
		System.out.println("Calculando dois números [int]: " + calculadora.soma(5, 5));
		System.out.println("Calculando três números [double]: " + calculadora.soma(2.0, 5.0));
		System.out.println("Calculando números que estão sendo passados no vetor: " + 
				calculadora.soma(vetNumerosInteiros));

	}

}
