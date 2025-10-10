package Aula16InterfacesEOPrincipioISP.exemploRuim;

import Aula16InterfacesEOPrincipioISP.DispositivoEletronico;

public class Iphone extends DispositivoEletronico implements Comportamentos {
    @Override
    public void ligarWifi() {
        System.out.println("Iphone ligando wifi");
    }

    @Override
    public void ligarBluetooth() {
        System.out.println("Iphone ligando bluetooth");
    }

    @Override
    public void abrirTetoSolar() {
        throw new UnsupportedOperationException("Iphone não possui essa funcionalidade de abrir teto solar");
    }

    @Override
    protected void ligar() {
        System.out.println("Iphone ligando");
    }

    @Override
    protected void desligar() {
        System.out.println("Iphone desligando");
    }

    @Override
    protected void emitirSom() {
        System.out.println("Iphone emitindo som");
    }
}
