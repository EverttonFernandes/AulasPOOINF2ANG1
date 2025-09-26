package Aula15HerancaPolimorfismoEOPrincipioLSP.exemploBom;

public class Aviao extends MeioDeTransporteAereo{

    public Aviao(String nomeDoTransporte, int quantidadeDePassageiros) {
        super(nomeDoTransporte, quantidadeDePassageiros);
    }

    @Override
    protected void decolar() {
        System.out.println("Avião decolando!");
    }

    @Override
    protected void aterrizar() {
        System.out.println("Avião aterrizando!");
    }

    @Override
    protected void voar() {
        System.out.println("Avião voando!");
    }
}
