package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Carro;
import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Oficina;
import br.com.fiap.beans.ParteCarro;

public abstract class TesteOficina {

	public static void main(String[] args) {
		
		
		Oficina objOficina = new Oficina(JOptionPane.showInputDialog("Digite o nome da oficina"),
				JOptionPane.showInputDialog("Digite o CNPJ"));
		
		
		Endereco objEndereco =new Endereco();
		Carro objCarro = new Carro();
		Colaborador objColaborador = new Colaborador();
		ParteCarro objParteCarro = new ParteCarro();
		
		objOficina.setEndereco(objEndereco);
		objOficina.setCarros(objCarro);
		objOficina.setColaborador(objColaborador);


	}

}
