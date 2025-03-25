package Aula02ObjetosEClassesEMetodosConstrutores.Exercicio2Carro;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Jeep", "Regenate", "Vermelho", 2022);
        System.out.println("O carro "
                .concat(carro1.marca)
                .concat(" no modelo ")
                .concat(carro1.modelo)
                .concat(" tem a sua cor ")
                .concat(carro1.cor)
                .concat(" e foi fabricado no ano ")
                .concat(String.valueOf(carro1.ano)));
    }
}
