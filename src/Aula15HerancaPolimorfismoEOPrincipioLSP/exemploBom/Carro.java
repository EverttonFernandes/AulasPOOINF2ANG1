package Aula15HerancaPolimorfismoEOPrincipioLSP.exemploBom;

public class Carro extends MeioDeTransporteTerrestre{

    public Carro(int velocidadeMaxima, String placa, boolean temCombustivel, String marca, String modelo) {
        super(velocidadeMaxima, placa, temCombustivel, marca, modelo);
    }

    @Override
    protected void acelerar() {
        System.out.println("Carro acelerando");
    }

    @Override
    protected void freiar() {
        System.out.println("Carro freiando");
    }

    @Override
    protected void buzinar() {
        System.out.println("Carro buzinando");
    }

}
