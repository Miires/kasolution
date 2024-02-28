package br.com.kasolution.dominio;

public class Horista extends Funcionario{
	private double valorHora;
	private double horasTrabalhadas;
	public Horista(int codigo, String nome, long cpf, double valorHora, double horasTrabalhadas) {
		super(codigo, nome, cpf);
		this.valorHora = valorHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}
	@Override
	public double calculaValorPagamento() {
		return valorHora*horasTrabalhadas;
	}
	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
