package br.com.kasolution.dominio;

public class ComissionadoAssalariado extends Comissionado{

	public ComissionadoAssalariado(int codigo, String nome, long cpf) {
		super(codigo, nome, cpf);
	}
	double salarioMensal;
	public double getSalarioMensal() {
		return salarioMensal;
	}
	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}
	
	

}
