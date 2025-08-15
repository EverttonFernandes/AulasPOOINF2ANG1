package Aula11EnumsNaPratica;


public enum StatusPedido {
    EM_PREPARACAO(1, "Em Preparação"),
    PENDENTE(2, "Pendente de pagamento"),
    ENTREGUE(3, "Entregue");

    private final int id;
    private final String descricaoDoPedido;

    StatusPedido(int id, String descricaoDoPedido) {
        this.id = id;
        this.descricaoDoPedido = descricaoDoPedido;
    }

    public int getId() {
        return id;
    }

    public String getDescricaoDoPedido() {
        return descricaoDoPedido;
    }
}
