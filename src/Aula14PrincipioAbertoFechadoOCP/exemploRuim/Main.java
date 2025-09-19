package Aula14PrincipioAbertoFechadoOCP.exemploRuim;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("PAGAMENTO NO PIX");
        Pagamento pagamentoPix = new Pagamento(TipoDePagamento.PIX);
        pagamentoPix.setChavePixDestinario("888.222.333-44");
        pagamentoPix.setValorDoPix(150.00);
        pagamentoPix.efetuarPagamento();

        System.out.println("-------------------");
        System.out.println("PAGAMENTO NO CREDITO");
        Pagamento pagamentoCredito = new Pagamento(TipoDePagamento.CREDITO);
        pagamentoCredito.setLimiteCartaoDeCredito(15000);
        pagamentoCredito.efetuarPagamento();
        System.out.println("-------------------");

        System.out.println("-------------------");
        System.out.println("PAGAMENTO NO DEBITO");
        Pagamento pagamentoDebito = new Pagamento(TipoDePagamento.DEBITO);
        pagamentoDebito.setSaldoTotalDaConta(5000);
        pagamentoDebito.efetuarPagamento();
        System.out.println("-------------------");
    }
}
