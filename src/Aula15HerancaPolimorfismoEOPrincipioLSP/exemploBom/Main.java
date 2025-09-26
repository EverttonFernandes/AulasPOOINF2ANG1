package Aula15HerancaPolimorfismoEOPrincipioLSP.exemploBom;

public class Main {
    public static void main(String[] args) {
        Aviao aviaoDaLatam = new Aviao("Avião", 50);
        aviaoDaLatam.decolar();
        aviaoDaLatam.voar();
        aviaoDaLatam.aterrizar();

        System.out.println("################################");

        Carro fusca = new Carro(180, "JIJ-9923", true, "Fusca", "antigo");
        fusca.acelerar();
        fusca.buzinar();
        fusca.freiar();

        System.out.println("################################");
        Corolla corolla = new Corolla(200, "JIJ-9923", true, "Fusca", "antigo");
        corolla.acelerar();
        corolla.buzinar();
        corolla.freiar();
        corolla.ligarCentralMultimidia();
    }
}
