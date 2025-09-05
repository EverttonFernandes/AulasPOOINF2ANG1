package Aula13RefatoracaoDoAlunoSystem;

public class AdvertenciaService {

    private AlunoRepositorio alunoRepositorio;

    public AdvertenciaService(AlunoRepositorio alunoRepositorio) {
        this.alunoRepositorio = alunoRepositorio;
    }

    // ===== Regras diversas (misturadas de propósito) =====
    public void registrarAdvertenciaPorFaltaEmAvaliacao(String ra, boolean faltou) {
        Aluno aluno = alunoRepositorio.validarExistencia(ra);
        if (aluno == null) return;

        if (faltou) {
            System.out.println("[OCORRENCIA] RA " + ra + " recebeu advertência por falta em avaliação.");
            NotificacaoService.enviarEmail(aluno.getEmail(),
                    "Advertência registrada",
                    "Compareça à coordenação para ciência.");
        }
    }
}
