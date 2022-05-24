package com.loiane.cursojava.aula33.labs;

public class Aluno {

	private String nome;
	private String matricula;
	private String cursoMatriculo;
	private String[] disciplinasMatriculadas;
	private double[][] notasDisciplinas;
	
	public Aluno() {
		disciplinasMatriculadas = new String[3];
		notasDisciplinas = new double[3][4];
	}

	public Aluno(String nome, String matricula, String cursoMatriculo, String[] disciplinasMatriculadas,
			double[][] notasDisciplinas) {
		this.nome = nome;
		this.matricula = matricula;
		this.cursoMatriculo = cursoMatriculo;
		this.disciplinasMatriculadas = new String[3];
		this.notasDisciplinas = new double[3][4];
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCursoMatriculo() {
		return cursoMatriculo;
	}

	public void setCursoMatriculo(String cursoMatriculo) {
		this.cursoMatriculo = cursoMatriculo;
	}

	public String[] getDisciplinasMatriculadas() {
		return disciplinasMatriculadas;
	}

	public void setDisciplinasMatriculadas(String[] disciplinasMatriculadas) {
		this.disciplinasMatriculadas = disciplinasMatriculadas;
	}

	public double[][] getNotasDisciplinas() {
		return notasDisciplinas;
	}

	public void setNotasDisciplinas(double[][] notasDisciplinas) {
		this.notasDisciplinas = notasDisciplinas;
	}

	
	public void mostrarInfo() {
		System.out.println("Nome: " + nome);
		System.out.println("Matricula: " + matricula);
		System.out.println("Curso: " + cursoMatriculo);
		
		for (int i = 0; i < disciplinasMatriculadas.length; i++) {
			System.out.println("Nome da Disciplina [" + (i+1) + "]: " + disciplinasMatriculadas[i]);
		}
		
		for (int i = 0; i < notasDisciplinas.length ; i++) {
			System.out.print("Notas da Disciplina de [ " + disciplinasMatriculadas[i] + " ]: ");
			System.out.print("{");
			for (int notas = 0; notas < notasDisciplinas[i].length ; notas++) {
				System.out.print(notasDisciplinas[i][notas] + ", ");
			}
			System.out.println("}");
		}
		
	}
	
	public boolean verificarAprovado(int indice) {
		
		if (obterMedia(indice) >= 7) {
			return true;
		} 
		
		return false;
		
	}
	
	private double obterMedia(int indice) {

		double soma = 0;

		for(int i = 0; i < notasDisciplinas[indice].length ; i++) {
			soma += notasDisciplinas[indice][i];
		}
		
		double media = (soma / 4);
		
		return media;
	}
	
	public void setNomeDisciplinaPos(int pos, String disciplinasMatriculadas) {
		this.disciplinasMatriculadas[pos] = disciplinasMatriculadas;
	}
	 
	public void setNotasDisciplinasPos(int posI, int posJ, double notasDisciplinas) {
		 this.notasDisciplinas[posI][posJ] = notasDisciplinas;
	}
	
}
