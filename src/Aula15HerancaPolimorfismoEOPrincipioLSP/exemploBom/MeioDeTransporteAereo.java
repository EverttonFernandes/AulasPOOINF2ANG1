package Aula15HerancaPolimorfismoEOPrincipioLSP.exemploBom;

public abstract class MeioDeTransporteAereo {
    protected String nomeDoTransporte;
    protected int quantidadeDePassageiros;

    protected MeioDeTransporteAereo(String nomeDoTransporte, int quantidadeDePassageiros) {
        this.nomeDoTransporte = nomeDoTransporte;
        this.quantidadeDePassageiros = quantidadeDePassageiros;
    }

    protected abstract void decolar();

    protected abstract void aterrizar();

    protected abstract void voar();
}
