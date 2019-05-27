package br.senac.model;

import java.util.Date;

/**
 * @author victor
 */
public class Venda {

    private int id;
    private int idCliente;
    private double valorTotal;
    private Date dataVenda;

    public Venda(int id, int idCliente, double valorTotal, Date dataVenda) {
        this.id = id;
        this.idCliente = idCliente;
        this.valorTotal = valorTotal;
        this.dataVenda = dataVenda;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }
    
    
    public Venda(int idCliente, double valorTotal) {
        this.idCliente = idCliente;
        this.valorTotal = valorTotal;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Venda() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor_total() {
        return valorTotal;
    }

    public void setValor_total(double valor_total) {
        this.valorTotal = valor_total;
    }

}
