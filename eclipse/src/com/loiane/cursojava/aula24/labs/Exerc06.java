package com.loiane.cursojava.aula24.labs;

public class Exerc06 {

	public static void main(String[] args) {
		
		E6AgendaCelular contato1 = new E6AgendaCelular();
		
		contato1.telefones = new String[5];
		
		contato1.nome = "Ana";
		contato1.sobrenome = "Andressa";
		contato1.ddd = "11";
		contato1.telefones[0] = "9.9999-8888";
		contato1.telefones[1] = "8.8888-4444";
		contato1.telefones[2] = "7.4444-5555";
		contato1.endereco = "Rua dos alfineiros, 4";
		contato1.email = "andressa.contato@gmail.com";
		
		System.out.println("Nome Contato: "+contato1.nome+
				"\nSobrenome: "+contato1.sobrenome+
				"\nDDD: "+contato1.ddd+
				"\nTelefones: "+contato1.telefones[0]+
				"\nE-mail: "+contato1.email+
				"\nEndereço: "+contato1.endereco);
		
		}
	
}
