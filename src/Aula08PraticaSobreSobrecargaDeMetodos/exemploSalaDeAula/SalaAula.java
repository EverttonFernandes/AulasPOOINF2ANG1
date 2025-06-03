package Aula08PraticaSobreSobrecargaDeMetodos.exemploSalaDeAula;

public class SalaAula {
    private String nomeDaSala;
    private Projetor projetor;
    private Ventilador ventilador;

    public SalaAula(String nomeDaSala) {
        this.nomeDaSala = nomeDaSala;
    }

    public SalaAula(String nomeDaSala, Projetor projetor) {
        this.nomeDaSala = nomeDaSala;
        this.projetor = projetor;
    }

    public SalaAula(String nomeDaSala, Projetor projetor, Ventilador ventilador) {
        this.nomeDaSala = nomeDaSala;
        this.projetor = projetor;
        this.ventilador = ventilador;
    }
}