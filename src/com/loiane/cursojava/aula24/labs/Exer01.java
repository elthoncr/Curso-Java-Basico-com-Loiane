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
		lamp.tipos[0] = "L�mpada incandescente cl�ssica transparente";
		lamp.tipos[1] = "L�mpada incandescente cl�ssica temperada";
		
		System.out.println("Informa��es da L�mpada");
		System.out.println("Marca: "+lamp.marca+"\nTipo: "+lamp.tipos[1]+"\nPot�ncia: "+lamp.potencia+"W."+"\nVoltagem: "+lamp.voltagem+"\nPre�o: "+lamp.preco);
		
		
	}

}
