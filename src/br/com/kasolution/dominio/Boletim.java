package br.com.kasolution.dominio;

public class Boletim {
    private String dataHoraImpressao;
    private Aluno[] alunos;

    // Construtor
    public Boletim(String dataHoraImpressao, Aluno[] alunos) {
        this.dataHoraImpressao = dataHoraImpressao;
        this.alunos = alunos;
    }

    // Métodos
    public void imprime() {
        System.out.println("Data/Hora de Impressão: " + dataHoraImpressao);
        System.out.println("------ Boletim Escolar ------");
    //    for (Aluno aluno : alunos) {
          //  if (aluno != null) {
        //        aluno.imprime();
            }
        }
    }

	public String getDataHoraImpressao() {
		// TODO Auto-generated method stub
		return null;
	}
}
