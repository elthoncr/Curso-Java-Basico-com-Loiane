package com.loiane.cursojava.aula24.labs;

public class TestaLampada {

	public static void main(String[] args) {
		
		Lampada lamp = new Lampada();
		lamp.marca = "Philips";
		lamp.tipo = "Lâmpada incandescente clássica transparente";
		lamp.potencia = "70W";
		lamp.voltagem = "220V";
		lamp.preco = 12;
		
		System.out.println("Informações da Lâmpada");
		System.out.println("Marca: "+lamp.marca+"\nTipo: "+lamp.tipo+"\nPotência: "+lamp.potencia+"\nVoltagem: "+lamp.voltagem+"\nPreço: "+lamp.preco);
		
		
	}

}
