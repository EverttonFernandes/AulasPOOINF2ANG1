package Aula14PrincipioAbertoFechadoOCP.exemploQueRespeitaOCP;

import Aula14PrincipioAbertoFechadoOCP.exemploRuim.TipoDePagamento;

public class PagamentoCredito extends PagamentoAbstrato {
    private double limiteCartaoDeCredito;
    private double valorDaCompra;
    private TipoDePagamento tipoDePagamento = TipoDePagamento.CREDITO;

    public PagamentoCredito(double limiteCartaoDeCredito, double valorDaCompra) {
        this.limiteCartaoDeCredito = limiteCartaoDeCredito;
        this.valorDaCompra = valorDaCompra;
    }

    @Override
    public void efetuarPagamento() {
        if (this.limiteCartaoDeCredito > this.valorDaCompra) {
            System.out.println("Pagamento no cartão de crédito efetuado com sucesso!");
        }
    }
}
