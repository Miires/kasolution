package br.com.kasolution.dominio;

import br.com.kasolution.dominio.Aluno;
import br.com.kasolution.dominio.Boletim;

public class TesteBoletim {
    public static void main(String[] args) {
        // Instanciando 4 alunos
        Aluno aluno1 = new Aluno("João", 123456789, "Engenharia", new double[]{9.5, 8.5, 7.0, 9.0});
        Aluno aluno2 = new Aluno("Maria", 987654321, "Medicina", new double[]{10.0, 9.0, 8.0, 7.5});
        Aluno aluno3 = new Aluno("Carlos", "Direito", new double[]{7.5, 6.5, 5.5, 6.0});
        Aluno aluno4 = new Aluno("Ana", new double[]{8.0, 7.0, 6.5, 7.5});
        
        // Criando array de alunos
        Aluno[] alunos = {aluno1, aluno2, aluno3, aluno4};

        // Instanciando o boletim
        Boletim boletim = new Boletim("19/02/2024 09:00", alunos);
        
        // Imprimindo o boletim
        System.out.println("Data/Hora de Impressão: " + boletim.getDataHoraImpressao());
        System.out.println("------ Boletim Escolar ------");
        for (Aluno aluno : alunos) {
            if (aluno != null) {
                aluno.imprime();
            }
        }
    }
}
