package Aula15HerancaPolimorfismoEOPrincipioLSP.exemploRuim;

public abstract class MeioDeTransporte {
    protected int velocidadeMaxima;
    protected String placa;
    protected boolean temCombustivel;
    protected String marca;
    protected String modelo;

    protected MeioDeTransporte(int velocidadeMaxima, String placa, boolean temCombustivel, String marca, String modelo) {
        this.velocidadeMaxima = velocidadeMaxima;
        this.placa = placa;
        this.temCombustivel = temCombustivel;
        this.marca = marca;
        this.modelo = modelo;
    }

    protected abstract void acelerar();

    protected abstract void freiar();

    protected abstract void buzinar();

}
