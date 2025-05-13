package Aula06ResolucaoDeExercicios.ExerciciosExtras.Exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Lanche {
    private String nomeLanche;
    private List<String> ingredientes;
    private Double preco;

    public Lanche(String nomeLanche, List<String> ingredientes, Double preco) {
        this.nomeLanche = nomeLanche;
        this.ingredientes = new ArrayList<>(); // lista mutável
        this.preco = preco;
    }

    public String getNomeLanche() {
        return nomeLanche;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public Double getPreco() {
        return preco;
    }

    public void inserirIngredientes(String ingrediente) {
        this.ingredientes.add(ingrediente);
    }

    public void exibirInformacoesDoIngrediente() {
        System.out.println("O nome do lanche e: " + this.getNomeLanche() + " e seus ingredientes inseridos são:");

        // Para cada ingrediente que está dentro da lista de ingrediente
        // vamos usar um ingrediente por vez para fazer algo
        for (String ingrediente : this.ingredientes) {
            System.out.println("-" + ingrediente);
        }

    }

}
