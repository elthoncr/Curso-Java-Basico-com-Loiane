package com.loiane.cursojava.aula27.labs;

public class Lampada {

	/**
	 *  Escreva uma classe para representar uma lâmpada. Desenvolva métodos para ligar,
	 *  desligar a lampada.
	 * */
	
	String modelo;
	String tensao;
	int potencia;
	String cor;
	String tipoLuz;
	String[] tipos;
	boolean tipoAbajur;
	boolean ligada;
	
	void imprimeLampada() {
		
		System.out.println("Modelo: " + modelo + "\n" +
				"Tensão: " + tensao + "\n" +
				"Pontencia: " + potencia + "\n");
		
	}
	
	void ligar() {
		ligada = true;
	}
	
	void desligar() {
		ligada = false;
	}
	
	void mostrarEstado() {
		if(ligada) {
			System.out.println("Lampada esta ligada.");
		} else {
			System.out.println("Lampada esta desligada.");
		}
	}
	
	void mudarEstado() {
		if(ligada) {
			desligar();
		} else {
			ligar();
		}
	}
}
