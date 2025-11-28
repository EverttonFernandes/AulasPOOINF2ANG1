package Aula18SimuladoProvaPratica;

public class AcaiGrande extends Acai implements Adicionavel {

    public AcaiGrande(String nomeDoAcai, double precoBase) {
        super(nomeDoAcai, precoBase);
    }

    @Override
    public void adicionarSabor(Sabor sabor) {
        if (this.listaDeSabores.size() >= 7) {
            throw new LimiteSaborAdicionalExcedidoException("Limite de sabores adicionais excedido para Açaí Grande.");
        } else {
            this.listaDeSabores.add(sabor);
            System.out.println("Sabor adicionado com sucesso: " + sabor.getNomeSabor());
        }
    }
}
