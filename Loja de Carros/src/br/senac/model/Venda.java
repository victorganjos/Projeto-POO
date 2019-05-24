package br.senac.model;

import java.util.Date;

/**
 * @author victor.ganjos
 */
public class Venda {
    private int id;
    private double valorTotal;
    private Date dataVenda;

    public Venda(int id, double valorTotal, Date dataVenda) {
        this.id = id;
        this.valorTotal = valorTotal;
        this.dataVenda = dataVenda;
    }

    public Venda(double valorTotal, Date dataVenda) {
        this.valorTotal = valorTotal;
        this.dataVenda = dataVenda;
    }

    public Venda() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }
    
    
}
