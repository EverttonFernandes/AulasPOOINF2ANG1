package Aula14PrincipioAbertoFechadoOCP.exemploQueRespeitaOCP;

public class Main {
    public static void main(String[] args) {
        System.out.println("PAGAMENTO NO PIX RESPEITANDO O PRINCIPIO OCP");
        PagamentoPix pagamentoPix = new PagamentoPix("888.222.333-44", 150.00);
        pagamentoPix.efetuarPagamento();
        System.out.println("-------------------");

        System.out.println("PAGAMENTO NO CREDITO RESPEITANDO O PRINCIPIO OCP");
        PagamentoCredito pagamentoCredito = new PagamentoCredito(15000, 300);
        pagamentoCredito.efetuarPagamento();
        System.out.println("-------------------");

    }
}
