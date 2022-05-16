package com.loiane.cursojava.aula36;

public class Contato {
	
	//Classe Contato
	//Contato tem um endereco
	//Contato tem muitos telefones
	
	/**
	 * 
	 * 	Para o relacionamento do tipo tem um: Basta declarar o tipo da classe.
	 *  Conforme eu declarei abaixo o tipo Endereco.
	 *  	private Endereco endereco;
	 *  
	 * */
	
	/**
	 *  Para fazer um relacionamento tem muitos.
	 *  Criar um tipo de classe com um Array Telefone[]
	 *  
	 *  E respeitando as boas práticas de programação colocar o tipo telefones no plural.
	 * */
	
	private String nome;
	private Endereco endereco;
	private Telefone[] telefones;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Telefone[] getTelefones() {
		return telefones;
	}
	public void setTelefones(Telefone[] telefones) {
		this.telefones = telefones;
	}


	
}
