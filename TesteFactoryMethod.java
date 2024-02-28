package br.com.kasolution.principal;

public class TesteFactoryMethod {
    public static void main(String[] args) {
        FabricaDocumento fabricaTexto = new FabricaDocumentoTexto();
        Documento documentoTexto = fabricaTexto.criarDocumento();
        documentoTexto.abrir();
        documentoTexto.fechar();

        FabricaDocumento fabricaExcel = new FabricaPlanilhaExcel();
        Documento planilhaExcel = fabricaExcel.criarDocumento();
        planilhaExcel.abrir();
        planilhaExcel.fechar();
    }
}

