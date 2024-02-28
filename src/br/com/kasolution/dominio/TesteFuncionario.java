package br.com.kasolution.dominio;

public class TesteFuncionario {
	public static void main(String[] args) {
		//Funcionario f = new Funcionario(1, "Regina Camila Dias", 94290056857L);
		Horista horista = new Horista(1,"Jose braga", 1323423337, 80, 40);
		horista.setSetor("Administrativo");
		horista.aumentaSalario(horista.calculaValorPagamento());
		System.out.println(horista.imprime());
		
		Comissionado comissionado = new    (3, "Marlete da Silva", 554821218, 5000, 10);

		comissionado.setSetor("Comercial");
		comissionado.aumentaSalario(comissionado.calculaValorPagamento());
		System.out.println(comissionado.imprime());
		
		//f.setSetor("TI");
		//f.aumentaSalario(12_000.00);
		//System.out.println(f.imprime());

		}
}
