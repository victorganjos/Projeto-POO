/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.model;

import java.util.Date;

/**
 *
 * @author Fabio
 */
public class Relatorio {
    private int id;
    private double valorTotal;
    private Date dataVenda;
    private String nome;
    
    public Relatorio (int id,double valorTotal, Date dataVenda){
        this.id = id;
        this.valorTotal = valorTotal;
        this.dataVenda = dataVenda;
    }

    public Relatorio() {
         
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
