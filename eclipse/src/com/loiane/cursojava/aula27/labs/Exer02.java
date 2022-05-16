package com.loiane.cursojava.aula27.labs;

public class Exer02 {

	public static void main(String[] args) {

		ContaCorrente conta1 = new ContaCorrente();
		
		conta1.numeroConta = 101010;
		conta1.nomeCliente = "Jose Carlos Rodrigues";
		conta1.saldo = 0;
		conta1.statusContaEspecial = true;
		conta1.limite = 5000;
		
		conta1.depositar(100);
		conta1.imprimeExtrato();
		conta1.sacar(110);
		conta1.imprimeExtrato();
		conta1.usarChequeEspecial(1000);
		conta1.imprimeExtrato();
		conta1.usarChequeEspecial(1000);
		conta1.imprimeExtrato();
		conta1.usarChequeEspecial(1000);
		conta1.imprimeExtrato();
		conta1.usarChequeEspecial(1000);
		conta1.imprimeExtrato();
		conta1.usarChequeEspecial(1000);
		conta1.imprimeExtrato();
		conta1.usarChequeEspecial(1000);
		conta1.imprimeExtrato();
		conta1.usarChequeEspecial(1000);
		conta1.imprimeExtrato();
		
		conta1.limite = 5000;
		
		conta1.imprimeExtrato();
		
		conta1.sacar(1000);
		
		conta1.imprimeExtrato();
	}

}
