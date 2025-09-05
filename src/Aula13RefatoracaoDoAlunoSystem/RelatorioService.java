package Aula13RefatoracaoDoAlunoSystem;

public class RelatorioService {

    private AlunoRepositorio alunoRepositorio;
    private AcademicoService academicoService;

    public RelatorioService(AlunoRepositorio alunoRepositorio, AcademicoService academicoService) {
        this.alunoRepositorio = alunoRepositorio;
        this.academicoService = academicoService;
    }

    // ===== Relatórios =====
    public void exportarCSV() {
        System.out.println("[EXPORT] alunos.csv");
        for (Aluno aluno : alunoRepositorio.getListaDeAlunos()) {
            double media = academicoService.calcularMedia(aluno.getRa());
            System.out.println(
                    aluno.getRa() + ";" +
                            aluno.getNome() + ";" +
                            aluno.getEmail() + ";" +
                            aluno.getSerie() + ";" +
                            media
            );
        }
    }

    public void exportarPDF() {
        System.out.println("[EXPORT] alunos.pdf");
        for (Aluno aluno : alunoRepositorio.getListaDeAlunos()) {
            double media = academicoService.calcularMedia(aluno.getRa());
            System.out.println(
                    aluno.getRa() + ";" +
                            aluno.getNome() + ";" +
                            aluno.getEmail() + ";" +
                            aluno.getSerie() + ";" +
                            media
            );
        }
    }

}
