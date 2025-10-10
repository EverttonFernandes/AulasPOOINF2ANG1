package Aula16InterfacesEOPrincipioISP;

import Aula16InterfacesEOPrincipioISP.exemploBom.Bluetooth;
import Aula16InterfacesEOPrincipioISP.exemploBom.Wifi;

public abstract class DispositivoEletronico implements Bluetooth, Wifi {
    protected abstract void ligar();
    protected abstract void desligar();
    protected abstract void emitirSom();
}
