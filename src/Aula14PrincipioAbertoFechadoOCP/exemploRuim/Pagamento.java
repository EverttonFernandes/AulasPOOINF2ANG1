package Aula14PrincipioAbertoFechadoOCP.exemploRuim;

public class Pagamento {
    private String chavePixDestinario;
    private double valorDoPix;
    private double limiteCartaoDeCredito;
    private double saldoTotalDaConta;
    private TipoDePagamento tipoDePagamento;

    public Pagamento(TipoDePagamento tipoDePagamento) {
        this.tipoDePagamento = tipoDePagamento;
    }

    public void setChavePixDestinario(String chavePixDestinario) {
        this.chavePixDestinario = chavePixDestinario;
    }

    public void setValorDoPix(double valorDoPix) {
        this.valorDoPix = valorDoPix;
    }

    public void setLimiteCartaoDeCredito(double limiteCartaoDeCredito) {
        this.limiteCartaoDeCredito = limiteCartaoDeCredito;
    }

    public void setSaldoTotalDaConta(double saldoTotalDaConta) {
        this.saldoTotalDaConta = saldoTotalDaConta;
    }

    public void efetuarPagamento() {
        if (this.tipoDePagamento.equals(TipoDePagamento.PIX)) {
            if (this.chavePixDestinario != null && !this.chavePixDestinario.isEmpty()) {
                if (this.valorDoPix > 0) {
                    System.out.println("PIX no valor de R$" + this.valorDoPix + " enviado para a chave " + this.chavePixDestinario);
                }
            }
        }

        if (this.tipoDePagamento.equals(TipoDePagamento.CREDITO)) {
            if (this.limiteCartaoDeCredito > 0) {
                System.out.println("Pagamento no cartão de crédito efetuado com sucesso!");
            }
        }

        if (this.tipoDePagamento.equals(TipoDePagamento.DEBITO)) {
            if (this.saldoTotalDaConta > 0) {
                System.out.println("Pagamento no cartão de débito efetuado com sucesso!");
            }
        }
    }
}
