package br.com.kasolution.dominio;

public class Peixe extends AnimalMarinho {
 String tipoEscama;

 public Peixe(String nome, int idade, String habitat, String tipoEscama) {
     super(nome, idade, habitat);
     this.tipoEscama = tipoEscama;
 }

 public void exibirInformacoesEspecificas() {
     super.exibirInformacoes();
     System.out.println("Tipo de Escama: " + tipoEscama);
 }
}
