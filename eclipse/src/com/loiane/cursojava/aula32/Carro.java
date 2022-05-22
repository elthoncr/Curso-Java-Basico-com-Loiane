package com.loiane.cursojava.aula32;

public class Carro {

	private String marca;
	private String modelo;
	private int numPassageiros;
	private double capCombustivel;
	private double consumoCombustivel;
	
	//String marca
	public String getMarca() {
		return this.marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
   //String modelo
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	//int numPassageiros
	public int getNumPassageiros() {
		return this.numPassageiros;
	}
	
	public void setNumPassageiros(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}
	
	//double capCombustivel
	public double getCapCombustivel() {
		return this.capCombustivel;
	}
	
	public void setCapCombustivel(double capCombustivel) {
		this.capCombustivel = capCombustivel;
	}
	
	//double consumoCombustivel
	public double getConsumoCombustivel() {
		return this.consumoCombustivel; 
	}
	
	public void setConsumoCombustivel(double consumoCombustivel) {
		this.consumoCombustivel = consumoCombustivel;
	}
	
}
