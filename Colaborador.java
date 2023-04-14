package br.com.fiap.beans;

public class Colaborador {

	private String nome; 
	private double valorHora;
	
	
	///////////////////////////////////
	
	public Colaborador(String nome, double valorHora) {
		super();
		this.nome = nome;
		this.valorHora = valorHora;
	}
	public Colaborador() {
		super();
		
	/////////////////////////////////////	
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
}
