package Aula17TratamentoDeExcecoes.exemploExcecaoPersonalizada;

public class SemBateriaException extends RuntimeException {
    public SemBateriaException(String message) {
        super(message);
    }
}
