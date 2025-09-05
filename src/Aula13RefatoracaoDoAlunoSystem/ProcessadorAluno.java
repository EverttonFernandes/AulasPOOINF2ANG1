package Aula13RefatoracaoDoAlunoSystem;

public class ProcessadorAluno {
    private AcademicoService academicoService;
    private AdvertenciaService advertenciaService;
    private AlunoRepositorio alunoRepositorio;
    private FinanceiroService financeiroService;
    private RelatorioService relatorioService;

    public ProcessadorAluno(AcademicoService academicoService, AdvertenciaService advertenciaService, AlunoRepositorio alunoRepositorio, FinanceiroService financeiroService, RelatorioService relatorioService) {
        this.academicoService = academicoService;
        this.advertenciaService = advertenciaService;
        this.alunoRepositorio = alunoRepositorio;
        this.financeiroService = financeiroService;
        this.relatorioService = relatorioService;
    }

    public AcademicoService getAcademicoService() {
        return academicoService;
    }

    public AdvertenciaService getAdvertenciaService() {
        return advertenciaService;
    }

    public AlunoRepositorio getAlunoRepositorio() {
        return alunoRepositorio;
    }

    public FinanceiroService getFinanceiroService() {
        return financeiroService;
    }

    public RelatorioService getRelatorioService() {
        return relatorioService;
    }
}
