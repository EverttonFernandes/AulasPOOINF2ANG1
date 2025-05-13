package Aula06ResolucaoDeExercicios.ExerciciosExtras.Exercicio1;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá informe o nome do lanche: ");
        String nomeDoLanche = scanner.nextLine();

        System.out.println("Informe o preco do lanche: ");
        Double preco = scanner.nextDouble();

        Lanche lanche = new Lanche(nomeDoLanche, List.of(), preco);

        System.out.println("Agora informe os ingredientes");
        for (int i = 1; i <= 4; i++) {
            String ingrediente = scanner.nextLine();
            lanche.inserirIngredientes(ingrediente);
        }

        lanche.exibirInformacoesDoIngrediente();
        scanner.close();
    }
}
