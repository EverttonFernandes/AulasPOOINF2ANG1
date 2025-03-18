package Aula01.Exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*
    * 1) Maior Número: Peça ao usuário dois números inteiros e informe qual é o maior.
    * Se forem iguais, avise que são iguais.
    * */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        int primeiroNumero = teclado.nextInt();

        System.out.println("Digite o segundo numero");
        int segundoNumero = teclado.nextInt();

        if (primeiroNumero > segundoNumero){
            System.out.println("O numero " + primeiroNumero + " e maior que o numero " + segundoNumero);
        }

        if (segundoNumero > primeiroNumero){
            System.out.println("O numero " + segundoNumero + " e maior que o numero " + primeiroNumero);
        }

        if (primeiroNumero == segundoNumero){
            System.out.println("Os dois numeros informados sao iguais");
        }

    }
}
