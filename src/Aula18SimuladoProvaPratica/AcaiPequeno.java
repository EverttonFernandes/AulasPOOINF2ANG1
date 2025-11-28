package Aula18SimuladoProvaPratica;

public class AcaiPequeno extends Acai implements Adicionavel {

    public AcaiPequeno(String nomeDoAcai, double precoBase) {
        super(nomeDoAcai, precoBase);
    }

    @Override
    public void adicionarSabor(Sabor sabor) {
        if (this.listaDeSabores.size() >= 3) {
            throw new LimiteSaborAdicionalExcedidoException("Limite de sabores adicionais excedido para Açaí Pequeno.");
        } else {
            this.listaDeSabores.add(sabor);
            System.out.println("Sabor adicionado com sucesso: " + sabor.getNomeSabor());
        }
    }


}
