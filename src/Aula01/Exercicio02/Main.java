package Aula01.Exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        * 2) Média Aritmética: Solicite três notas e ao fim calcule a média aritmética.
        * */

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a primeira nota:");
        float primeiraNota = teclado.nextFloat();

        System.out.println("Informe a segunda nota:");
        float segundaNota = teclado.nextFloat();

        System.out.println("Informe a terceira nota:");
        float terceiraNota = teclado.nextFloat();

        float somaTotalDasNotas = primeiraNota + segundaNota + terceiraNota;

        float resultado = somaTotalDasNotas / 3;

        System.out.printf("A sua nota final e: %.2f", resultado);

    }
}
