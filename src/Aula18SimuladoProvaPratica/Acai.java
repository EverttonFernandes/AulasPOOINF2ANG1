package Aula18SimuladoProvaPratica;

import java.util.ArrayList;
import java.util.List;

public abstract class Acai implements Removivel {
    protected String nomeDoAcai;
    protected List<Sabor> listaDeSabores = new ArrayList<>();
    protected double precoBase;
    protected double valorTotalDosSabores;

    public Acai(String nomeDoAcai, List<Sabor> listaDeSabores, double precoBase, double valorTotalDosSabores) {
        this.nomeDoAcai = nomeDoAcai;
        this.listaDeSabores = listaDeSabores;
        this.precoBase = precoBase;
        this.valorTotalDosSabores = valorTotalDosSabores;
    }

    public Acai(String nomeDoAcai, double precoBase) {
        this.nomeDoAcai = nomeDoAcai;
        this.precoBase = precoBase;
    }

    @Override
    public void removerSabor(Sabor sabor) {
        if (this.listaDeSabores.removeIf(sabor::equals)) {
            System.out.println("Sabor removido com sucesso: " + sabor.getNomeSabor());
        } else {
            throw new RemoverSaborInvalidoException("Sabor não encontrado: " + sabor.getNomeSabor());
        }
    }

    protected void calcularValorTotalDosSabores() {
        for (Sabor sabor : this.listaDeSabores) {
            if (!sabor.isGratuito()) {
                this.valorTotalDosSabores += sabor.getPrecoSabor();
            }
        }
    }

    public double getValorTotalDosSabores() {
        return valorTotalDosSabores;
    }

    public double getPrecoBase() {
        return precoBase;
    }
}
