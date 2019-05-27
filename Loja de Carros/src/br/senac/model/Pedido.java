package br.senac.model;

/**
 * @author victor
 */
public class Pedido extends Venda {

    private int id;
    private int id_venda;
    private int id_itemvenda;

    public Pedido(int id_venda, int id_itemvenda) {
        this.id_venda = id_venda;
        this.id_itemvenda = id_itemvenda;
    }

    public Pedido() {
    }

    public Pedido(int id, int id_venda, int id_itemvenda) {
        this.id = id;
        this.id_venda = id_venda;
        this.id_itemvenda = id_itemvenda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_venda() {
        return id_venda;
    }

    public void setId_venda(int id_venda) {
        this.id_venda = id_venda;
    }

    public int getId_itemvenda() {
        return id_itemvenda;
    }

    public void setId_itemvenda(int id_itemvenda) {
        this.id_itemvenda = id_itemvenda;
    }

}
