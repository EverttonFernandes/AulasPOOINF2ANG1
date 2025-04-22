package AulaPratica05AssociacaoAgregacaoEComposicao;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArCondicionado arCondicionado = new ArCondicionado();
        Aluno enzo = new Aluno();
        Aluno fabiano = new Aluno();

        List<Aluno> alunos = new ArrayList<>();
        alunos.add(enzo);
        alunos.add(fabiano);

        Computador computador1 = new Computador();
        Computador computador2 = new Computador();
        List<Computador> computadores = new ArrayList<>();
        computadores.add(computador1);
        computadores.add(computador2);

        LaboratorioInformatica laboratorioInformatica = new LaboratorioInformatica(arCondicionado, alunos, computadores, "Lab1");
        laboratorioInformatica.exibirInformacoes();
    }
}
