package br.com.kasolution.dominio;

public class MamiferoMarinho extends AnimalMarinho {
 String tipoBarbatana;

 public MamiferoMarinho(String nome, int idade, String habitat, String tipoBarbatana) {
     super(nome, idade, habitat);
     this.tipoBarbatana = tipoBarbatana;
 }

 public void exibirInformacoesEspecificas() {
     super.exibirInformacoes();
     System.out.println("Tipo de Barbatana: " + tipoBarbatana);
 }
}
