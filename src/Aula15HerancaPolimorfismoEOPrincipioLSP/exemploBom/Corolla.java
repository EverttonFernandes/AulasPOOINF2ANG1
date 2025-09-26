package Aula15HerancaPolimorfismoEOPrincipioLSP.exemploBom;

public class Corolla extends Carro{
    public Corolla(int velocidadeMaxima, String placa, boolean temCombustivel, String marca, String modelo) {
        super(velocidadeMaxima, placa, temCombustivel, marca, modelo);
    }

    @Override
    protected void acelerar() {
        System.out.println("Corolla acelerando");
    }

    @Override
    protected void freiar() {
        System.out.println("Corolla freiando!");;
    }

    @Override
    protected void buzinar() {
        super.buzinar();
    }

    public void ligarCentralMultimidia(){
        System.out.println("Central multimidia do Corolla ligado!");
    }
}
