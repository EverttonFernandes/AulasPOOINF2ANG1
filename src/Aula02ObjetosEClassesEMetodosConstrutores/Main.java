package Aula02ObjetosEClassesEMetodosConstrutores;

public class Main {
    public static void main(String[] args) {
        // forma que devemos instanciar um objeto definido
        Pessoa pessoa1 = new Pessoa("Agatha", 16, 1.65, "Brasileira");
        System.out.println(pessoa1.nome);
        System.out.println(pessoa1.idade);
        System.out.println(pessoa1.tamanho);
        System.out.println(pessoa1.nacionalidade);
        System.out.println("-----------------------------------");

        Pessoa pessoa2 = new Pessoa("Caio", 17, 1.70, "Brasileiro");

        System.out.println(pessoa2.nome);
        System.out.println(pessoa2.idade);
        System.out.println(pessoa2.tamanho);
        System.out.println(pessoa2.nacionalidade);
        System.out.println("-----------------------------------");

        Pessoa pessoa3 = new Pessoa("Esther", 16, 1.68, "Brasileira");

        System.out.println("Olá pessoal, me chamo "
                + pessoa3.nome
                + " tenho "
                + pessoa3.idade
                + " anos de idade "
                + "e possuo "
                + pessoa3.tamanho + "cm de altura"
                + " e sou "
                + pessoa3.nacionalidade);

    }
}
