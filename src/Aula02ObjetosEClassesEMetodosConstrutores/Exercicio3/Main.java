package Aula02ObjetosEClassesEMetodosConstrutores.Exercicio3;

public class Main {
    public static void main(String[] args) {
        Celular celular = new Celular("Samsumg", "A71", 64, "Rosa");

        System.out.println("Meu celular da marca "
                .concat(celular.marca)
                .concat(" no modelo ")
                .concat(celular.modelo)
                .concat(" possui ao todo ")
                .concat(String.valueOf(celular.gigabytes))
                .concat(" GB de memória")
                .concat(" e a sua cor e ")
                .concat(celular.cor));
    }
}
