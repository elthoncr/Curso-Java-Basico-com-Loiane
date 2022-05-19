package com.loiane.cursojava.aula27.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {

		//Declarando e instanciando Aluno.
		Aluno aluno1 = new Aluno();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o nome do aluno");
		aluno1.nome = scan.next();
		
		System.out.println("Entre com o nome do curso");
		aluno1.nomeCurso = scan.next();
		
		System.out.println("Entre com a matricula");
		aluno1.matricula = scan.next();
		
		aluno1.nomeDisciplinas = new String[3];
		
		//Lendo nome das disciplinas.
		for (int i = 0; i < aluno1.nomeDisciplinas.length; i++) {
			System.out.println("Digite a Disciplina" + "[ " + (i+1) + " ]");
			aluno1.nomeDisciplinas[i] = scan.next();
		}

		//Declarando e instanciando array bidimensional notasDisciplinas
		//Array aluno1.notasDisciplinas[0][0] que vai até aluno1.notasDisciplinas[3][3] 
		aluno1.notasDisciplinas = new double[3][4];
		
		//Lendo 3 notas das 3 disciplinas
		for (int i = 0; i < aluno1.notasDisciplinas.length; i++) {
			for (int nota = 0; nota < aluno1.notasDisciplinas[i].length; nota++) {
				System.out.println("Digite a nota " + "[" + (nota+1) + "]" + " da Disciplina de [ " + aluno1.nomeDisciplinas[i] +" ] :");
				aluno1.notasDisciplinas[i][nota] = scan.nextDouble();
			}
		}
		
		//double media = aluno1.notasDisciplinas[0][0];
		
		//System.out.println(media);
		
	}

}
