package com.loiane.cursojava.aula27.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {

		// Declarando e instanciando Aluno.
		Aluno aluno1 = new Aluno();

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o nome do aluno");
		aluno1.nome = scan.nextLine();

		System.out.println("Entre com o nome do curso");
		aluno1.nomeCurso = scan.nextLine();

		System.out.println("Entre com a matricula");
		aluno1.matricula = scan.nextLine();

		aluno1.nomeDisciplinas = new String[3];

		// Lendo nome das disciplinas.
		for (int i = 0; i < aluno1.nomeDisciplinas.length; i++) {
			System.out.println("Digite a Disciplina" + "[ " + (i + 1) + " ]");
			aluno1.nomeDisciplinas[i] = scan.nextLine();
		}

		// Declarando e instanciando array bidimensional notasDisciplinas
		// Array aluno1.notasDisciplinas[0][0] que vai até aluno1.notasDisciplinas[3][3]
		aluno1.notasDisciplinas = new double[3][4];

		// Lendo 3 notas das 3 disciplinas
		for (int i = 0; i < aluno1.notasDisciplinas.length; i++) {
			for (int nota = 0; nota < aluno1.notasDisciplinas[i].length; nota++) {
				System.out.println("Digite a nota " + "[" + (nota + 1) + "]" + " da Disciplina de [ "
						+ aluno1.nomeDisciplinas[i] + " ] :");
				aluno1.notasDisciplinas[i][nota] = scan.nextDouble();
			}
		}

		aluno1.mostrarInfo();
		
		aluno1.verificarAprovado(1);

		for (int i = 0; i<aluno1.nomeDisciplinas.length; i++) {
			if (aluno1.verificarAprovado(i) ) {
				System.out.println("Disciplina " + aluno1.nomeDisciplinas[i] + " - foi aprovado.");
			} else {
				System.out.println("Disciplina " + aluno1.nomeDisciplinas[i] + " - reprovado.");
			}
		}
		
		// double media = aluno1.notasDisciplinas[0][0];

		// System.out.println(media);

	}

}
