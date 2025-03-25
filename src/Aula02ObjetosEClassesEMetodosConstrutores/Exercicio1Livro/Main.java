package Aula02ObjetosEClassesEMetodosConstrutores.Exercicio1Livro;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Renegados", "Marisa Meyer", 450, "Português");
        System.out.println("O livro "
                .concat(livro1.titulo)
                .concat(" da autora ")
                .concat(livro1.autor)
                .concat(" possui ao todo ")
                .concat(String.valueOf(livro1.numeroDePaginas))
                .concat(" no idioma ")
                .concat(livro1.idioma));
    }
}
