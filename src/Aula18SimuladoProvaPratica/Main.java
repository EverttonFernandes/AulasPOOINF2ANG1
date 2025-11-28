package Aula18SimuladoProvaPratica;

public class Main {
    public static void main(String[] args) {
        Sabor cremeLeitinho = new Sabor("Creme de Leitinho", 5.0, false);
        Sabor cremeRafaello = new Sabor("Creme Rafaello", 5.0, false);
        Sabor nutella = new Sabor("Nutella", 5.0, false);
        Sabor saborMorango = new Sabor("Morango", 5.0, false);
        Sabor cremeDeAvelã = new Sabor("Creme de Avelã", 5.0, false);

        AcaiPequeno acaiPequeno = new AcaiPequeno("Açaí Pequeno", 10.0);

        acaiPequeno.adicionarSabor(cremeLeitinho);
        acaiPequeno.adicionarSabor(cremeRafaello);
        acaiPequeno.adicionarSabor(nutella);
//        acaiPequeno.adicionarSabor(saborMorango); // SE DESCOMENTAR, VAI ESTOURAR A EXCEÇÃO
        acaiPequeno.calcularValorTotalDosSabores();
        System.out.println("Valor total dos sabores: " + acaiPequeno.getValorTotalDosSabores());
//        acaiPequeno.removerSabor(cremeDeAvelã); // SE DESCOMENTAR, VAI ESTOURAR A EXCEÇÃO

        Pedido pedido = new Pedido(acaiPequeno, TipoPagamento.PIX);
        pedido.calcularValorTotalComDescontos();
    }
}
