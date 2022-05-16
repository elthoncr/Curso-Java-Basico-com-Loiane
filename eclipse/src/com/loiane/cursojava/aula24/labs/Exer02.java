package com.loiane.cursojava.aula24.labs;

public class Exer02 {

	public static void main(String[] args) {

		E2Livro book = new E2Livro();
		
		book.titulo = "Harry Potter e a Pedra Filosofal";
		book.autor = "J.K.Rowling";
		book.editora = "ROCCO";
		book.qtaPaginas = 300;
		book.anoLancamento = 2000;
		book.isbn = "1234567890";
		book.categoria = "Fantasia";
		
		System.out.println("Livro: "+book.titulo+"\nAutor: "+book.autor);
		
	}
	
}
