package Aula05PraticaAssociacaoAgregacaoEComposicao;

import java.util.ArrayList;
import java.util.List;

public class LaboratorioInformatica {
    // Ar condicionado é o exemplo de associação
    private ArCondicionado arCondicionado;
    // Lista de alunos é o exemplo de agregação
    private List<Aluno> alunos = new ArrayList<>();
    // E a lista de computadores é o exemplo de composição
    private List<Computador> computadores = new ArrayList<>();

    private String nomeLaboratorio;

    public LaboratorioInformatica(ArCondicionado arCondicionado, List<Aluno> alunos, List<Computador> computadores, String nomeLaboratorio) {
        this.arCondicionado = arCondicionado;
        this.alunos = alunos;
        this.computadores = computadores;
        this.nomeLaboratorio = nomeLaboratorio;
    }

    public void exibirInformacoes() {
        System.out.println("O laboratório cujo seu nome e "
                + this.nomeLaboratorio
                + " possui "
                + this.alunos.size()
                + " alunos e possui "
                + this.computadores.size()
                + " computadores");
    }
}
