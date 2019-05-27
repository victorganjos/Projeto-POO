package br.senac.model;

/**
 * @author victor.ganjos
 */
public class ItemVenda extends Pedido {

    private int id;
    private int idProduto;
    private double valorUnitario;

    public ItemVenda(int id, int idProduto, double valorUnitario) {
        this.id = id;
        this.idProduto = idProduto;
        this.valorUnitario = valorUnitario;
    }

    public ItemVenda() {
    }

    public ItemVenda(int idProduto, double valorUnitario) {
        this.idProduto = idProduto;
        this.valorUnitario = valorUnitario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

}
