package com.loiane.cursojava.aula24.labs;

import java.util.Date;

public class Exer04 {

	public static void main(String[] args) {
	
		E4LivroDeBiblioteca livroDeBiblio1 = new E4LivroDeBiblioteca();
		
		livroDeBiblio1.titulo = "Harry Potter e a Pedra Filosofal";
		livroDeBiblio1.autor = "J.K.Rowling";
		livroDeBiblio1.editora = "ROCCO";
		livroDeBiblio1.qtaPaginas = 300;
		livroDeBiblio1.anoLancamento = 2000;
		livroDeBiblio1.isbn = "1234567890";
		livroDeBiblio1.categoria = "Fantasia";
		
		livroDeBiblio1.emprestado = true;
		
		livroDeBiblio1.dataEntrega = new Date();
		livroDeBiblio1.emprestadoPara = "Elthon Rodrigues";
		livroDeBiblio1.devolvido = false;
		livroDeBiblio1.reservar = false;
		livroDeBiblio1.renovar = false;
		livroDeBiblio1.punirAtrasos = false;
		livroDeBiblio1.limparReservas = false;
		
		System.out.println("Livro: "+livroDeBiblio1.titulo+"\nEmprestado Para: "+livroDeBiblio1.emprestadoPara);
		
		
	}
	
}
