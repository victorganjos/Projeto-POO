package br.senac.model;

/**
 * @author victor.ganjos
 */
public class ItemVenda {
    private int id, produto, quantidade;
    private double valorUnit;

    public ItemVenda(int id, int produto, int quantidade, double valorUnit) {
        this.id = id;
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorUnit = valorUnit;
    }

    public ItemVenda(int produto, int quantidade, double valorUnit) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorUnit = valorUnit;
    }

    public ItemVenda() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProduto() {
        return produto;
    }

    public void setProduto(int produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorUnit() {
        return valorUnit;
    }

    public void setValorUnit(double valorUnit) {
        this.valorUnit = valorUnit;
    }
    
    
}
