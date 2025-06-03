package Aula08PraticaSobreSobrecargaDeMetodos.exemploSalaDeAula;

public class Main {
    public static void main(String[] args) {
        Projetor projetor = new Projetor();
        Ventilador ventilador = new Ventilador();
        SalaAula salaAula = new SalaAula("Sala01");
        SalaAula salaAula2 = new SalaAula("Sala02", projetor);
        SalaAula salaAula3 = new SalaAula("Sala03", projetor, ventilador);

    }
}
