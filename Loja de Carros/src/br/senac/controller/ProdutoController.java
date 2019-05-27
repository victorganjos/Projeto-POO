package br.senac.controller;

import br.senac.dao.ProdutoDAO;
import br.senac.model.Produto;
import java.util.ArrayList;
import java.util.List;

/**
 * @author victor.ganjos
 */
public class ProdutoController{
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
    public static void desativar(int id) {
        ProdutoDAO produto = new ProdutoDAO();
        produto.desativar(id);
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
 
    public static ArrayList<String[]> consulta() {
        List<Produto> produto = new ProdutoDAO().consultar();
        ArrayList<String[]> listaProduto = new ArrayList<>();
        for (int i = 0; i < produto.size(); i++) {
            listaProduto.add(new String[]{String.valueOf(produto.get(i).getId()),
                produto.get(i).getModelo(), produto.get(i).getMarca(),
                String.valueOf(produto.get(i).getAno()),
                produto.get(i).getCor(),
                String.valueOf(produto.get(i).getPlaca()),
                String.valueOf(produto.get(i).getValorCompra())});

        }
        return listaProduto;

    }
    public static ArrayList<String[]> consultaPorNome(String pNome) {
        List<Produto> cliente = new ProdutoDAO().consultarPorNome(pNome);

        ArrayList<String[]> listaClientes = new ArrayList<>();

        for (int i = 0; i < cliente.size(); i++) {
            listaClientes.add(new String[]{String.valueOf(cliente.get(i).getId()), cliente.get(i).getModelo(), cliente.get(i).getMarca(), cliente.get(i).getAno(), cliente.get(i).getCor(), cliente.get(i).getPlaca(), String.valueOf(cliente.get(i).getValorCompra())});

        }

        return listaClientes;

    }
    public static ArrayList<String[]> consultaPorPlaca(String placa) {
        List<Produto> produto = ProdutoDAO.consultaVendaProduto(placa);

        ArrayList<String[]> listaProdutos = new ArrayList<>();

        for (int i = 0; i < produto.size(); i++) {
            listaProdutos.add(new String[]{String.valueOf(produto.get(i).getId()), produto.get(i).getModelo(), produto.get(i).getMarca(), produto.get(i).getAno(), produto.get(i).getCor(), produto.get(i).getPlaca(), String.valueOf(produto.get(i).getValorCompra())});

        }

        return listaProdutos;

    }
    
    public static ArrayList<String[]> read2(int id) {

        ArrayList<Produto> itens = ProdutoDAO.consultaDois(id);
        ArrayList<String[]> listaItens = new ArrayList<>();

        for (int i = 0; i < itens.size(); i++) {
            listaItens.add(new String[]{
                String.valueOf(itens.get(i).getId()),
                String.valueOf(itens.get(i).getModelo()),
                String.valueOf(itens.get(i).getValorCompra())});

        }
        return listaItens;

    }
}
