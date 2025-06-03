package Aula08PraticaSobreSobrecargaDeMetodos.exemploCalculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.somar(5, 5));
        System.out.println(calculadora.somar(5, 5, 5));
        System.out.println(calculadora.somar(5.0, 5.0));
        System.out.println(calculadora.somar(5.0F, 5.0F));
    }
}
