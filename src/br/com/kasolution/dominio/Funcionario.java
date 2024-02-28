package br.com.kasolution.dominio;

public abstract class Funcionario {
	final private int codigo;
	private String nome;
	final private long cpf;
	private String setor;
	private double salario;
	private boolean ativo;

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public Funcionario(int codigo, String nome, long cpf) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
		this.ativo = true;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length() > 2) {
			
		}
		this.nome = nome;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		switch (setor.toUpperCase()) {
		case "ADMINISTRATIVO":
		case "FINANCEIRO":
		case "RECURSOS HUMANOS":
		case "COMERCIAL":
		case "TI":

			this.setor = setor;

		}
		this.setor = setor;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getCodigo() {
		return codigo;
	}

	public long getCpf() {
		return cpf;
	}
	
	public void aumentaSalario(double valor) {

		if (valor > 0) { salario += valor; }

		}


	public String imprime() {

		StringBuilder info = new StringBuilder("Funcionário: ").append(codigo).append("\nNome: ").append(nome)

			.append("\nCPF.: ").append(cpf).append("\nSetor: ").append(setor).append("\nSalário: ")

			.append(salario).append("\nSituação: ")

			.append(ativo ? "Ativo" : "Inativo");

		return info.toString();

	}
	
	public abstract double calculaValorPagamento();
	
	public abstract String getTipo();


}
																					