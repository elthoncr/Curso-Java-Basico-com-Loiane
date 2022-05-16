package com.loiane.cursojava.aula27.labs;

public class ContaCorrente {

	int numeroConta;
	String nomeCliente;
	double saldo;
	boolean statusContaEspecial;
	double limite;
	boolean usandoLimite;
	
	//Metodo - sacar - verifica se cliente pode sacar dinheiro.
	//Se cliente tem saldo e o valor para sacar é menor do que o disponivel na conta, o cliente saca.
	//Senão Se 
	void sacar(double vlrSacar) {
		
		//double auxVlrParaSacar = vlrSacar;
		double vlrSaldoMaisLimite = saldo + limite;
		double cltUsouLimite = 0;
		//double sobraDivida = 0;
		double auxLimite = 0;
		
		if (vlrSacar <= saldo) 
		{
			saldo = saldo - vlrSacar;
			System.out.println("\n-------- SAQUE -------");
			System.out.println("Valor de Saque: " + vlrSacar);
			System.out.println("Saldo CC+L: " + saldoMaisLimite() + "\n");
		} 
		else if(vlrSacar < vlrSaldoMaisLimite)
		{
			cltUsouLimite = vlrSacar - saldo;
			saldo = 0;
			auxLimite = limite - cltUsouLimite;
			limite = auxLimite;
			usandoLimite = true;
			System.out.println("\n-------- SAQUE -------");
			System.out.println("Valor de Saque: " + vlrSacar);
			System.out.println("Usou de Limite: " + cltUsouLimite);
			System.out.println("Limite: " + auxLimite  + "\n");
		} 
		else 
		{
			System.out.println("\n-------- SAQUE -------");
			System.out.println("Valor é maior que o saldo disponivel em sua conta.");
			System.out.println("Saldo CC+L: " + saldoMaisLimite() + "\n");
		}
	}
	
	//Metodo - Depositar Dinheiro
	void depositar(double valorParaDepositar) {
		
		
		
		
		saldo = saldo + valorParaDepositar;
		
		
		else if(vlrSacar < vlrSaldoMaisLimite)
		{
			cltUsouLimite = vlrSacar - saldo;
			saldo = 0;
			auxLimite = limite - cltUsouLimite;
			limite = auxLimite;
			usandoLimite = true;
			System.out.println("\n-------- SAQUE -------");
			System.out.println("Valor de Saque: " + vlrSacar);
			System.out.println("Usou de Limite: " + cltUsouLimite);
			System.out.println("Limite: " + auxLimite  + "\n");
		} 
		
		double vlrDepositar;
		double vlrSaldoMaisLimite;
		
		if (usandoLimite && vlrDepositar > vlrSaldoMaisLimite) {
			System.out.println("");
			
		} 
		else if (!usandoLimite) {
			System.out.println("\n------ DEPOSITO ------");
			System.out.println("Depositou: " + valorParaDepositar);
			System.out.println("Saldo CC+L: " + saldoMaisLimite() + "\n");
		}
		else {
			System.out.println("");
		}
		
		
	}
	
	//Metodo - Consultar Saldo
	void consultaSaldo() {
		System.out.println("Saldo: " + saldo);
	}
	
	//Metodo - Imprime Extrato
	void imprimeExtrato() {
		System.out.println("------ EXTRATO ------");
		System.out.println("Conta: " + numeroConta);
		System.out.println("Cliente: " + nomeCliente);
		consultaSaldo();
		consultaChequeEspecial();
		System.out.println("Saldo CC+L: " + saldoMaisLimite() + "\n");
	}
	
	//Metodo - Verificar se o Cliente esta usando Cheque Especial.
	void consultaChequeEspecial() {
		System.out.println("Cheque Especial: " + limite);
	}
	
	//Metodo - Usar Cheque Especial
	void usarChequeEspecial(double valorParaUsarChequeEspecial) {
		
		if(valorParaUsarChequeEspecial > limite) {
			System.out.println("\n-------- CHEQUE ESPECIAL -------");
			System.out.println("O valor informado e maior que o valor disponivel em sua conta.");
			System.out.println("Valor informado: " + valorParaUsarChequeEspecial);
			System.out.println("Saldo CC+L: " + saldoMaisLimite() + "\n");
		} else {
			System.out.println("\n-------- CHEQUE ESPECIAL -------");
			limite = limite - valorParaUsarChequeEspecial;
			System.out.println("Usei o cheque especial.");
			System.out.println("Usou de Limite: " + valorParaUsarChequeEspecial);
			System.out.println("Saldo CC+L: " + saldoMaisLimite() + "\n");
		}
				
	}
	
	// Metodo retorna Saldo + Limite em conta.
	double saldoMaisLimite() {
		
		double saldoMaisLimiteC = saldo + limite;
		
		return saldoMaisLimiteC;
	}
	
	
}
