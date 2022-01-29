package br.com.alura.rh.model;

import java.math.BigDecimal;

public class Terceirizado {
	
	private DadosPessoais dados = new DadosPessoais();
	
	private String empresa;

	public void setNome(String nome) {
		this.dados.setNome(nome);
	}
	
	public String getNome() {
		return this.dados.getNome();
	}
	
	public void setCpf(String cpf) {
		this.dados.setCpf(cpf);
	}
	
	public String getCpf() {
		return this.dados.getCpf();
	}
	
	public void setCargo(Cargo cargo) {
		this.dados.setCargo(cargo);
	}
	
	public Cargo getCargo() {
		return this.dados.getCargo();
	}
	
	public void setSalario(BigDecimal salario) {
		this.dados.setSalario(salario);
	}
	
	public BigDecimal getSalario() {
		return this.dados.getSalario();
	}

	public String getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
}

