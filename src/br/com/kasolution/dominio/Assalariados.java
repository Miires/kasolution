package br.com.kasolution.dominio;

public class Assalariados extends Funcionario{
	public Assalariados(int codigo, String nome, long cpf) {
		super(codigo, nome, cpf);
	}

	double salarioSemanal;

	public double getSalarioSemanal() {
		return salarioSemanal;
	}

	public void setSalarioSemanal(double salarioSemanal) {
		this.salarioSemanal = salarioSemanal;
	}

	@Override
	public double calculaValorPagamento() {
		return salarioSemanal * 4.5;
		return 0;
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
