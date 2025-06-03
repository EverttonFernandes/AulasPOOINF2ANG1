package Aula03PraticaSobreVisibilidadeGettersESetters;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("875.333.123-50", "876345102", "Lucas", "Rua C");
        System.out.println(pessoa.getCpf());
        System.out.println(pessoa.getRg());
        System.out.println(pessoa.getEndereco());

        // Como mudar o endereço do Lucas? Usamos o método setter para isso!
        pessoa.setEndereco("Rua General Balbao 111");
        System.out.println(pessoa.getEndereco());
    }
}
