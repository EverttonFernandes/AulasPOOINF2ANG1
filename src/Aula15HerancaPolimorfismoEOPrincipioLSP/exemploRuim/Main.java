package Aula15HerancaPolimorfismoEOPrincipioLSP.exemploRuim;

public class Main {
    public static void main(String[] args) {
        Carro fusca = new Carro(180, "JIJ-9923", true, "Fusca", "antigo");
        fusca.acelerar();
        fusca.buzinar();
        fusca.freiar();

        System.out.println("#############################");

        Aviao aviaoDaLatam = new Aviao(200, null, true, "Latam", "algumModelo");
        aviaoDaLatam.acelerar();
        aviaoDaLatam.buzinar();
    }
}
