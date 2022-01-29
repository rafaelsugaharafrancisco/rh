package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {

	private DadosPessoais dados = new DadosPessoais();
	
	private LocalDate dataUltimoReajuste;

	public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario) {
		this.dados.setNome(nome);
		this.dados.setCpf(cpf);
		this.dados.setCargo(cargo);
		this.dados.setSalario(salario);
	}

	public void reajustarSalario(BigDecimal novoSalario) {
		this.dados.setSalario(novoSalario);
		this.dataUltimoReajuste = LocalDate.now();
	}

	public String getNome() {
		return this.dados.getNome();
	}

	public void setNome(String nome) {
		this.dados.setNome(nome);
	}

	public String getCpf() {
		return this.dados.getCpf();
	}

	public void setCpf(String cpf) {
		this.dados.setCpf(cpf);
	}

	public Cargo getCargo() {
		return this.getCargo();
	}

	public void setCargo(Cargo cargo) {
		this.dados.setCargo(cargo);
	}

	public BigDecimal getSalario() {
		return this.dados.getSalario();
	}

	public void setSalario(BigDecimal salario) {
		this.dados.setSalario(salario);
	}

	public LocalDate getDataUltimoReajuste() {
		return dataUltimoReajuste;
	}

	public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
		this.dataUltimoReajuste = dataUltimoReajuste;
	}

	public void promover(Cargo proximoCargo) {
		this.dados.setCargo(proximoCargo);
	}

}
