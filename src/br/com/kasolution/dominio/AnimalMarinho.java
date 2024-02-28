package br.com.kasolution.dominio;

public class AnimalMarinho {
 String nome;
 int idade;
 String habitat;

 public AnimalMarinho(String nome, int idade, String habitat) {
     this.nome = nome;
     this.idade = idade;
     this.habitat = habitat;
 }

 public void exibirInformacoes() {
     System.out.println("Nome: " + nome);
     System.out.println("Idade: " + idade + " anos");
     System.out.println("Habitat: " + habitat);
 }
}
