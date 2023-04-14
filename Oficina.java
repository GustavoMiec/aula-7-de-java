package br.com.fiap.beans;

public class Oficina {

	private String nome;
	private String cnpj;
	private Endereco endereco;
	private Carro carros;
	private Colaborador colaborador;
	
	
	
		////////////////////////////////////////////////////////
	
	
	
	public Oficina(String nome, String cnpj) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
	}
	
	public Oficina(String nome, String cnpj, Endereco endereco, Carro carros, Colaborador colaborador) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.carros = carros;
		this.colaborador = colaborador;
	}
	public Oficina() {
		super();
	
		
		
		//////////////////////////////////////////////////////
			
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Carro getCarros() {
		return carros;
	}
	public void setCarros(Carro carros) {
		this.carros = carros;
	}
	public Colaborador getColaborador() {
		return colaborador;
	}
	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}
}
