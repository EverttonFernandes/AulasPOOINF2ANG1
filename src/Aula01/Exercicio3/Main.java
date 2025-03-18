package Aula01.Exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * 3) Soma de 1 até N: Peça um número inteiro positivo e calcule a soma de todos os números de 1 até esse número.
         *  */
        System.out.println("Informe um numero");
        Scanner teclado = new Scanner(System.in);
        int numeroInformadoPeloUsuario = teclado.nextInt();

        int somaTotal = 0;
        for (int indice = 1; indice <= numeroInformadoPeloUsuario; indice++) {
            somaTotal += indice;
        }

        System.out.println("A soma total do numero 1 ate o numero informado e: " + somaTotal);
    }
}
