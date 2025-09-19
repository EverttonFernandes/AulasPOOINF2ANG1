package Aula14PrincipioAbertoFechadoOCP.exemploQueRespeitaOCP;

import Aula14PrincipioAbertoFechadoOCP.exemploRuim.TipoDePagamento;

public class PagamentoPix extends PagamentoAbstrato {
    private String chavePixDestinario;
    private double valorDoPix;
    private TipoDePagamento tipoDePagamento = TipoDePagamento.PIX;

    public PagamentoPix(String chavePixDestinario, double valorDoPix) {
        this.chavePixDestinario = chavePixDestinario;
        this.valorDoPix = valorDoPix;
    }

    @Override
    public void efetuarPagamento() {
        // TODA A LOGICA PARA PAGAR NO PIX VAI TA AQUI DENTRO
        if (this.tipoDePagamento.equals(TipoDePagamento.PIX)) {
            if (this.chavePixDestinario != null && !this.chavePixDestinario.isEmpty()) {
                if (this.valorDoPix > 0) {
                    System.out.println("PIX no valor de R$" + this.valorDoPix + " enviado para a chave " + this.chavePixDestinario);
                }
            }
        }
    }
}
