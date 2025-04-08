package Aula04ListaDeExercicios.Exercicio3Acai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá! Informe o tamanho do seu açaí:");
        String tamanhoDoAcai = scanner.nextLine();

        Acai acai = new Acai(tamanhoDoAcai, 16.00);

        System.out.println("Informe 3 sabores para montar seu açaí:");
        for (int i = 1; i <= 3; i++) {
            System.out.print("Sabor " + i + ": ");
            String sabor = scanner.nextLine();
            acai.inserirSabores(sabor);
        }

        acai.exibirInformacoes();

        scanner.close();
    }
}

