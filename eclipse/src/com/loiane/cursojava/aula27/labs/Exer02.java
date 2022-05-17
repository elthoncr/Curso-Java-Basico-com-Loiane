package com.loiane.cursojava.aula27.labs;

public class Exer02 {

	public static void main(String[] args) {

		ContaCorrente conta1 = new ContaCorrente();
		
		conta1.numeroConta = 101010;
		conta1.agencia = "1234";
		conta1.nomeCliente = "Jose Carlos Rodrigues";
		conta1.saldo = -10;
		conta1.especial = true;
		conta1.limiteEspecial = 500;
		
		conta1.depositar(100);
		conta1.imprimeExtrato();
		conta1.sacar(110);
		conta1.imprimeExtrato();
		
		conta1.imprimeExtrato();
		
		conta1.limiteEspecial = 500;
		
		conta1.imprimeExtrato();
		
		conta1.sacar(1000);
		
		conta1.imprimeExtrato();
		
		System.out.println("Saldo da conta: " + conta1.numeroConta + " = " + conta1.saldo);
		
		boolean saqueEfetuado = conta1.sacar(10);
		
		if (saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso.");
			conta1.consultarSaldo();
		} else {
			System.out.println("Não foi possivel realizar o saque. Saldo insuficiente.");
		}
		
		saqueEfetuado = conta1.sacar(500);
		System.out.println("Tentativa de Saque de 500 reais.");
		
		if (saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso.");
			conta1.consultarSaldo();
		} else {
			System.out.println("Nao foi possivel realizar o saque. Saldo insuficiente.");
		}
		
		conta1.depositar(500);
		conta1.consultarSaldo();
		
		if(conta1.verificarUsoChequeEspecial()) {
			System.out.println("Esta usando cheque especial");
		} else {
			System.out.println("Nao esta usando cheque especial");
		}
		
		conta1.sacar(900);
		conta1.consultarSaldo();
		
		if(conta1.verificarUsoChequeEspecial()) {
			System.out.println("Esta usando cheque especial");
		} else {
			System.out.println("Nao esta usando cheque especial");
		}
		
	}

}
