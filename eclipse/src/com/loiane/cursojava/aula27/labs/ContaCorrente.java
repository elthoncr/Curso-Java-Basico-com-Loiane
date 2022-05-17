package com.loiane.cursojava.aula27.labs;

public class ContaCorrente {

	int numeroConta;
	String nomeCliente;
	String agencia;
	double saldo;
	boolean especial;
	double limiteEspecial;
	double valorEspecialUsado;
	
	//Metodo - sacar - verifica se cliente pode sacar dinheiro.
	boolean sacar(double quantiaASacar) {
		
		//Tem saldo na Conta
		if (saldo >= quantiaASacar) 
		{
			saldo -= quantiaASacar;
			return true;
		} else { //não tem saldo na conta
			if (especial) {
				//verifica se o limite especial tem saldo
				double limite = limiteEspecial + saldo;
				if (limite >= quantiaASacar) {
					saldo -= quantiaASacar;
					return true;
				} else {
					return false;
				}
			} else {
				return false; //não é especial e não tem saldo suficiente.
			}
		}
		
	}
	
	//Metodo - Depositar Dinheiro
	void depositar(double valorDepositado) {		
		
		saldo += valorDepositado;
		System.out.println("\n------ DEPOSITO ------");
		System.out.println("Depositou: " + valorDepositado);
		System.out.println("Saldo CC+L: " + saldoMaisLimite() + "\n");
		
	}
	
	//Metodo - Consultar Saldo
	void consultarSaldo() {
		System.out.println("Saldo: " + saldo);
	}
	
	//Metodo - Imprime Extrato
	void imprimeExtrato() {
		System.out.println("------ EXTRATO ------");
		System.out.println("Conta: " + numeroConta);
		System.out.println("Cliente: " + nomeCliente);
		consultarSaldo();
		consultaChequeEspecial();
		System.out.println("Saldo CC+L: " + saldoMaisLimite() + "\n");
	}
	
	//Metodo - Verificar se o Cliente esta usando Cheque Especial.
	void consultaChequeEspecial() {
		System.out.println("Cheque Especial: " + valorEspecialUsado);
	}
	
	
	// Metodo retorna Saldo + Limite em conta.
	double saldoMaisLimite() {
		
		double saldoMaisLimiteC = saldo + valorEspecialUsado;
		
		return saldoMaisLimiteC;
	}
	
	
	boolean verificarUsoChequeEspecial() {
		return saldo < 0;
	}
	
}
