package com.loiane.cursojava.aula24.labs;

import java.util.Date;

public class E4LivroDeBiblioteca {

	/**
	 * 
	 *  4. Usando o resultado do modelo "Livro" como base, crie uma classe "LivroDeBiblioteca"
	 *  	que represente os dados básicos de um livro de uma biblioteca, que pode ser
	 *  	emprestado a leitores.
	 * 
	 * */
	
	String titulo;
	String autor;
	String editora;
	int qtaPaginas;
	int anoLancamento;
	String isbn;
	String categoria;
	
	boolean emprestado;
	Date dataEntrega;
	String emprestadoPara;
	boolean devolvido;
	boolean reservar;
	boolean renovar;
	boolean punirAtrasos;
	boolean limparReservas;
	
}
