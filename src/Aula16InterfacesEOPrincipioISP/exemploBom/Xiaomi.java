package Aula16InterfacesEOPrincipioISP.exemploBom;

import Aula16InterfacesEOPrincipioISP.DispositivoEletronico;

public class Xiaomi extends DispositivoEletronico {

    @Override
    protected void ligar() {
        System.out.println("Ligando");
    }

    @Override
    protected void desligar() {
        System.out.println("Desligando");
    }

    @Override
    protected void emitirSom() {
        System.out.println("Emitindo som");
    }

    @Override
    public void ligarBluetooth() {
        System.out.println("Ligando bluetooth");
    }

    @Override
    public void ligarWifi() {
        System.out.println("Ligando wifi");
    }
}
