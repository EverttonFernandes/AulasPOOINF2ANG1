package Aula17TratamentoDeExcecoes.exemploExcecaoComTryCatch;

public class ConexaoBancoDeDadosException extends RuntimeException {
    public ConexaoBancoDeDadosException(String message) {
        super(message);
    }
}
