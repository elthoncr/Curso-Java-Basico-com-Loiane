package com.loiane.cursojava.aula24.labs;

public class Exer01 {

	public static void main(String[] args) {
		
		E1Lampada lamp = new E1Lampada();
		
		lamp.marca = "Philips";
		lamp.modelo = "A60";
		lamp.tensao = "Bivolt";
		lamp.potencia = 7;
		lamp.cor = "Amarela";
		lamp.tipoLuz = "Amarela";
		lamp.tipoAbajur = true;
		
		lamp.voltagem = "220V";
		lamp.preco = 12;
		
		lamp.tipos = new String[5];
		lamp.tipos[0] = "Lâmpada incandescente clássica transparente";
		lamp.tipos[1] = "Lâmpada incandescente clássica temperada";
		
		System.out.println("Informações da Lâmpada");
		System.out.println("Marca: "+lamp.marca+"\nTipo: "+lamp.tipos[1]+"\nPotência: "+lamp.potencia+"W."+"\nVoltagem: "+lamp.voltagem+"\nPreço: "+lamp.preco);
		
		
	}

}
