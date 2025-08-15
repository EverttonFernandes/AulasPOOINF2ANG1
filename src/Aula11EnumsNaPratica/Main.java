package Aula11EnumsNaPratica;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido("Pizza", 29.99, StatusPedido.EM_PREPARACAO);
        pedido.detalhesDoPedido();
    }
}
