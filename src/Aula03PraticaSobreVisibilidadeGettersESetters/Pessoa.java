package Aula03PraticaSobreVisibilidadeGettersESetters;

public class Pessoa {
    private String cpf;
    private String rg;
    private String nome;
    private String endereco;

    public Pessoa(String cpf, String rg, String nome, String endereco) {
        this.cpf = cpf;
        this.rg = rg;
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
