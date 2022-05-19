package com.loiane.cursojava.aula27.labs;

public class Aluno {

	String nome;
	String matricula;
	String nomeCurso;
	String[] nomeDisciplinas;
	double[][] notasDisciplinas;
	
	void mostrarInfo() {
		System.out.println("Nome: " + nome);
		System.out.println("Matricula: " + matricula);
		System.out.println("Curso: " + nomeCurso);
		
		for (int i = 0; i < notasDisciplinas.length ; i++) {
			System.out.print("Notas da Disciplina de [ " + nomeDisciplinas[i] + " ]: ");
			System.out.print("{");
			for (int notas = 0; notas < notasDisciplinas.length ; notas++) {
				System.out.print(notasDisciplinas[i][notas] + ",");
			}
			System.out.println("}");
		}
		
		for (int i = 0; i < nomeDisciplinas.length; i++) {
			System.out.println("Nome Disciplina [" + (i+1) + "]: " + nomeDisciplinas[i]);
		}
		
	}
	
}
