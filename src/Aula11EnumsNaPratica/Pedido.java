package Aula11EnumsNaPratica;

public class Pedido {
    private String descricao;
    private double valor;
    private StatusPedido statusPedido; // Usamos como atributo na nossa classe
    // Esse atributo é do tipo StatusPedido, que é o nosso enum!

    public Pedido(String descricao, double valor, StatusPedido statusPedido) {
        this.descricao = descricao;
        this.valor = valor;
        this.statusPedido = statusPedido;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public StatusPedido getStatusPedido() {
        return statusPedido;
    }

    public void detalhesDoPedido() {
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: R$" + valor);
        System.out.println("Status do Pedido: " + statusPedido.getDescricaoDoPedido());
    }
}
