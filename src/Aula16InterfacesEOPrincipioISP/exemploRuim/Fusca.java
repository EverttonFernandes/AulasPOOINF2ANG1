package Aula16InterfacesEOPrincipioISP.exemploRuim;

import Aula16InterfacesEOPrincipioISP.Veiculo;

public class Fusca extends Veiculo implements Comportamentos {
    @Override
    public void ligarWifi() {
        throw new UnsupportedOperationException("Fusca não possui essa funcionalidade de ligar wifi");
    }

    @Override
    public void ligarBluetooth() {
        throw new UnsupportedOperationException("Fusca não possui essa funcionalidade de ligar bluetooth");
    }

    @Override
    public void abrirTetoSolar() {
        throw new UnsupportedOperationException("Fusca não possui essa funcionalidade de ligar bluetooth");
    }

    @Override
    protected void acelerar() {
        System.out.println("Fusca acelerando");
    }

    @Override
    protected void frear() {
        System.out.println("Fusca freando");
    }

    @Override
    protected void buzinar() {
        System.out.println("Fusca buzinando");
    }
}
