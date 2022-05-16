package com.loiane.cursojava.aula24.labs;

public class Exerc05 {

	public static void main (String[] args) {
		
		E5ContaCorrente conta1 = new E5ContaCorrente();
		conta1.numeroConta = 5098;
		conta1.nomeCliente = "Elthon Rodrigues";
		conta1.saldo = 3900;
		conta1.limite = 10000;
		conta1.statusContaEspecial = true;
		
		System.out.println("Número da Conta: "+conta1.numeroConta+
				"\nNome do Cliente: "+conta1.nomeCliente+
				"\nSaldo: "+conta1.saldo+
				"\nLimite: "+conta1.limite+
				"\nConta Especial: "+conta1.statusContaEspecial);
		}
	
}
