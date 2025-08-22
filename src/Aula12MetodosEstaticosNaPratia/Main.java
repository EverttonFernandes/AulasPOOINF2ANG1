package Aula12MetodosEstaticosNaPratia;

public class Main {
    public static void main(String[] args) {
        CalculadoraNormal calculadoraNormal = new CalculadoraNormal();
        calculadoraNormal.somar(5, 10);

        CalculadoraComMetodoEstatico.somar(2, 2);
        // Quando o método é estático, não precisamos instanciar o objeto.
        // Quando o método é estático, precisamos criar uma instância da classe para chamar o método.

        // Usamos métodos estáticos em situações onde gostariamos de ter um comportamento genérico
        // em diferentes lugares, como por exemplo, somar, multiplicar ou fazer qualquer outra
        // operacao matematica para uma loja, uma lancheria, um banco, uma lotérica, escola e etc.
        // com isto não precisamos nos acoplar diretamente a classe, basta chamar o método estático.


    }
}
