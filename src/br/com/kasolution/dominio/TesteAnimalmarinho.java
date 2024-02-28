package br.com.kasolution.dominio;

public class TesteAnimalmarinho {
 public static void main(String[] args) {
     
     Peixe sardinha = new Peixe("Sardinha", 1, "Oceano Atlântico", "Ctenoide");
     MamiferoMarinho golfinho = new MamiferoMarinho("Golfinho", 5, "Oceano", "Dorsal");

     sardinha.exibirInformacoesEspecificas();
     System.out.println();
     golfinho.exibirInformacoesEspecificas();
 }
}
