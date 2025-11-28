package Aula18SimuladoProvaPratica;

public class Pedido {
    private Acai acai;
    private double valorTotalDoAcaiComSeusSaboresPagos;
    private TipoPagamento tipoPagamento;

    public Pedido(Acai acai, TipoPagamento tipoPagamento) {
        this.acai = acai;
        this.tipoPagamento = tipoPagamento;
    }

    public void calcularValorTotalComDescontos() {
        double total = acai.getValorTotalDosSabores() + acai.getPrecoBase();
        if (tipoPagamento.equals(TipoPagamento.PIX)){
            total -= 7.0;
            System.out.println("O valor total do acai com seus sabores pagos no PIX foi: " + total);
        } else {
            System.out.println("O valor total do acai com seus sabores pagos foi: " + total);
        }
    }
}
