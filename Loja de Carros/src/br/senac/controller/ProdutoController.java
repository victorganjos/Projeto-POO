package br.senac.controller;

import br.senac.dao.ProdutoDAO;
import br.senac.model.Produto;
import java.util.List;

/**
 * @author victor.ganjos
 */
public class ProdutoController {
    public static void salvar(String modelo, String marca, String ano, String cor, String placa, double valorCompra) {
        Produto p = new Produto(modelo,marca,ano,cor, placa,valorCompra);
        ProdutoDAO produto = new ProdutoDAO();
        produto.salvar(p);
    }

    public static void atualizar(int id, String modelo, String marca, String ano, String cor, String placa, double valorCompra) {
        Produto p = new Produto(id,modelo,marca,ano,cor, placa,valorCompra);
        ProdutoDAO produto = new ProdutoDAO();
        produto.atualizar(p);
    }

    public static void excluir(int id) {
        ProdutoDAO produto = new ProdutoDAO();
        produto.deletar(id);
    }

    public static List<Produto> consultarPorNome(String nome) {
        ProdutoDAO produto = new ProdutoDAO();
        return produto.consultarPorNome(nome);
    }

    public static List<Produto> consultar() {
        ProdutoDAO produto = new ProdutoDAO();
        return produto.consultar();
    }

    public static List<Produto> consultarPorId(int id) {
        ProdutoDAO produto = new ProdutoDAO();
        return produto.consultarPorId(id);
    }
}
