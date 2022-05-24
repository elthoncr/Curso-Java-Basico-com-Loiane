package com.loiane.cursojava.aula33.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		//Declarando e instanciando Aluno.
		Aluno aluno1 = new Aluno();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Nome do aluno: ");
		aluno1.setNome(scan.nextLine());
		
		System.out.println("Nome do Curso: ");
		aluno1.setCursoMatriculo(scan.nextLine());
		
		System.out.println("Número da Matricula: ");
		aluno1.setMatricula(scan.nextLine());
		
		// Lendo nome das disciplinas.
		for (int i = 0; i < aluno1.getDisciplinasMatriculadas().length; i++) {
			System.out.println("Digite a Disciplina" + "[ " + (i + 1) + " ]");
			//aluno1.setDisciplinasMatriculadas[i] = scan.nextLine();
			aluno1.setNomeDisciplinaPos(i, scan.nextLine());
		}
		
		System.out.println("");
		


		// Lendo 3 notas das 3 disciplinas
		for (int i = 0; i < aluno1.getNotasDisciplinas().length; i++) {
			for (int j = 0; j < aluno1.getNotasDisciplinas()[i].length; j++) {
				System.out.println("Digite a nota " + "[" + (j + 1) + "]" + " da Disciplina de [ "
						+ aluno1.getDisciplinasMatriculadas()[i] + " ] :");
				//aluno1.setNotasDisciplinas()[i][nota] = scan.nextDouble();
				aluno1.setNotasDisciplinasPos(i, j, scan.nextDouble());
			}
		}

		aluno1.mostrarInfo();
		
		aluno1.verificarAprovado(1);

		for (int i = 0; i<aluno1.getDisciplinasMatriculadas().length; i++) {
			if (aluno1.verificarAprovado(i) ) {
				System.out.println("Disciplina " + aluno1.getDisciplinasMatriculadas()[i] + " - foi aprovado.");
			} else {
				System.out.println("Disciplina " + aluno1.getDisciplinasMatriculadas()[i] + " - reprovado.");
			}
		}
		
	}

}
