package Aula02ObjetosEClassesEMetodosConstrutores.Exercicio1Livro;

public class Livro {
    String titulo;
    String autor;
    int numeroDePaginas;
    String idioma;

    public Livro(String titulo, String autor, int numeroDePaginas, String idioma) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.idioma = idioma;
    }
}
