package Aula02ObjetosEClassesEMetodosConstrutores.Exemplo;

public class Pessoa {
    // Atributos definidos de uma classe
    String nome;
    int idade;
    Double tamanho;
    String nacionalidade;

    // Método construtor (sempre tem o nome da classe e seus atributos por parametro)
    public Pessoa(String nome, int idade, Double tamanho, String nacionalidade){
        this.nome = nome;
        this.idade = idade;
        this.tamanho = tamanho;
        this.nacionalidade = nacionalidade;
    }

}
