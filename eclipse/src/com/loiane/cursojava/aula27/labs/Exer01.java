package com.loiane.cursojava.aula27.labs;

public class Exer01 {

	public static void main(String[] args) {

		Lampada lampada1 = new Lampada();
		
		lampada1.tipos = new String[5];
		
		lampada1.modelo = "Lampada Florescente.";
		lampada1.cor = "Amarela.";
		lampada1.tipos[0] = "Lampada para Jardim";
		lampada1.tensao = "Bivolt";
		lampada1.tipoAbajur = false;
		lampada1.potencia = 7;
		
		//lampada1.imprimeLampada();
		lampada1.ligar();
		lampada1.ligar();
		lampada1.mostrarEstado();
		lampada1.mudarEstado();
		lampada1.mostrarEstado();
		lampada1.desligar();
		lampada1.mostrarEstado();
		lampada1.desligar();
		lampada1.ligar();
		lampada1.desligar();
		
	}

}
