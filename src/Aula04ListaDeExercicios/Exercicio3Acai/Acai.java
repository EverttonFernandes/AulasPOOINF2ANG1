package Aula04ListaDeExercicios.Exercicio3Acai;

import java.util.ArrayList;
import java.util.List;

public class Acai {
    private String tamanhoAcai;
    private List<String> listaDeSabores = new ArrayList<>();
    private double preco;

    public Acai(String tamanhoAcai, double preco) {
        this.tamanhoAcai = tamanhoAcai;
        this.preco = preco;
    }

    public void inserirSabores(String sabor) {
        this.listaDeSabores.add(sabor);
    }

    public void exibirInformacoes() {
        System.out.println("\nResumo do pedido:");
        System.out.println("O tamanho do acai e: " + this.tamanhoAcai
                + " o seu preco e " + this.preco + "R$"
                + " e os sabores sao ");
        System.out.println("Sabores escolhidos:");
        for (String sabor : this.listaDeSabores) {
            System.out.println("- " + sabor);
        }
    }

}
