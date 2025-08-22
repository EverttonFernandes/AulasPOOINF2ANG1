package Aula12MetodosEstaticosNaPratia;

public class Main {
    public static void main(String[] args) {
        CalculadoraNormal calculadoraNormal = new CalculadoraNormal();
        calculadoraNormal.somar(5, 10);

        CalculadoraComMetodoEstatico.somar(5, 10);
    }
}
