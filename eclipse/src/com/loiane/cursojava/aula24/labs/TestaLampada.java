package com.loiane.cursojava.aula24.labs;

public class TestaLampada {

	public static void main(String[] args) {
		
		Lampada lamp = new Lampada();
		lamp.marca = "Philips";
		lamp.tipo = "L�mpada incandescente cl�ssica transparente";
		lamp.potencia = "70W";
		lamp.voltagem = "220V";
		lamp.preco = 12;
		
		System.out.println("Informa��es da L�mpada");
		System.out.println("Marca: "+lamp.marca+"\nTipo: "+lamp.tipo+"\nPot�ncia: "+lamp.potencia+"\nVoltagem: "+lamp.voltagem+"\nPre�o: "+lamp.preco);
		
		
	}

}
