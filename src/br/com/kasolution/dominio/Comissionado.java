package br.com.kasolution.dominio;

public class   extends Funcionario{
	public Comissionado(int codigo, String nome, long cpf) {
		super(codigo, nome, cpf);
	}
	double vendaBruta;
	double porcentagemComissao;
	public double getVendaBruta() {
		return vendaBruta;
	}
	public void setVendaBruta(double vendaBruta) {
		this.vendaBruta = vendaBruta;
	}
	public double getPorcentagemComissao() {
		return porcentagemComissao;
	}
	public void setPorcentagemComissao(double porcentagemComissao) {
		this.porcentagemComissao = porcentagemComissao;
	}
	@Override
	public double calculaValorPagamento() {
		return vendaBruta * porcentagemComissao;
		return 0;
	}
	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
