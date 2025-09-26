package Aula15HerancaPolimorfismoEOPrincipioLSP.exemploRuim;

public class Aviao extends MeioDeTransporte {

    public Aviao(int velocidadeMaxima, String placa, boolean temCombustivel, String marca, String modelo) {
        super(velocidadeMaxima, placa, temCombustivel, marca, modelo);
    }

    @Override
    protected void acelerar() {
        System.out.println("Acelerando antes de decolar!");
    }

    @Override
    protected void freiar() {

    }

    @Override
    protected void buzinar() {
        throw new UnsupportedOperationException("Avião não buzina!");
    }
}
