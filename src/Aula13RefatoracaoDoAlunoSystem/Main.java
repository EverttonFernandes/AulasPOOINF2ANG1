package Aula13RefatoracaoDoAlunoSystem;

public class Main {
    public static void main(String[] args) {
        AlunoRepositorio alunoRepositorio = new AlunoRepositorio();
        AcademicoService academicoService = new AcademicoService(alunoRepositorio);
        AdvertenciaService advertenciaService = new AdvertenciaService(alunoRepositorio);
        FinanceiroService financeiroService = new FinanceiroService(alunoRepositorio);
        RelatorioService relatorioService = new RelatorioService(alunoRepositorio, academicoService);
        ProcessadorAluno processadorAluno = new ProcessadorAluno(academicoService, advertenciaService, alunoRepositorio, financeiroService, relatorioService);

        processadorAluno.getAlunoRepositorio().cadastrarAluno("2025001", "Ana", "ana@ifsul.edu", Serie.PRIMEIRO);
        processadorAluno.getAcademicoService().registrarNota("2025001", 8);
        processadorAluno.getAcademicoService().registrarNota("2025001", 4.5);
        processadorAluno.getFinanceiroService().registrarPagamento("2025001", 250.00);

        StatusPagamento status = processadorAluno.getFinanceiroService().verificarStatusPagamento("2025001", 250.00);
        System.out.println("Status financeiro: " + status.getRotulo());

        processadorAluno.getAdvertenciaService().registrarAdvertenciaPorFaltaEmAvaliacao("2025001", true);
        processadorAluno.getRelatorioService().exportarCSV();
        processadorAluno.getRelatorioService().exportarPDF();
    }
}
