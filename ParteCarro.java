package br.com.fiap.beans;

public class ParteCarro {

	private String motor;
	private String roda;
	
	
	////////////////////////////////////////////////////
	
	public ParteCarro(String motor, String roda) {
		super();
		this.motor = motor;
		this.roda = roda;
	}
	public ParteCarro() {
		super();
	}	
	/////////////////////////////////////////////////////	
	
	
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public String getRoda() {
		return roda;
	}
	public void setRoda(String roda) {
		this.roda = roda;
	}
	
}
