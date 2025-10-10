package Aula16InterfacesEOPrincipioISP.exemploRuim;

import Aula16InterfacesEOPrincipioISP.Veiculo;

public class Citroen extends Veiculo implements Comportamentos {

    @Override
    protected void acelerar() {
        System.out.println("Citroen acelerando");
    }

    @Override
    protected void frear() {
        System.out.println("Citroen freando");
    }

    @Override
    protected void buzinar() {
        System.out.println("Citroen buzinando");
    }

    @Override
    public void ligarWifi() {
        System.out.println("Citroen ligando wifi");
    }

    @Override
    public void ligarBluetooth() {
        System.out.println("Citroen ligando bluetooth");
    }

    @Override
    public void abrirTetoSolar() {
        System.out.println("Citroen abrindo teto solar");
    }
}
