package Aula15HerancaPolimorfismoEOPrincipioLSP.exemploRuim;

public class Carro extends MeioDeTransporte {

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
