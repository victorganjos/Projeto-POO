package br.senac.controller;

import br.senac.dao.VendaDAO;
import br.senac.model.Venda;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author victor.ganjos
 */
public class VendaController {

    public void salvar(int idCliente, double valorTotal) {
        Venda v = new Venda(idCliente, valorTotal);
        VendaDAO vendas = new VendaDAO();
        vendas.salvar(v);
    }

    public static void excluir(int id) {
        VendaDAO vendas = new VendaDAO();
        vendas.deletar(id);
    }

    public List<Venda> consultar() {
        VendaDAO vendas = new VendaDAO();
        return vendas.consultar();
    }

    public static List<Venda> consultarPorId(int id) {
        VendaDAO vendas = new VendaDAO();
        return vendas.consultarPorId(id);
    }

    public static ArrayList<String[]> consulta() {
        List<Venda> vendas = new VendaDAO().consultar();
        ArrayList<String[]> listaVendas = new ArrayList<>();

        for (int i = 0; i < vendas.size(); i++) {
            listaVendas.add(new String[]{String.valueOf(vendas.get(i).getId()),
                String.valueOf(vendas.get(i).getIdCliente()),
                String.valueOf(vendas.get(i).getValorTotal()),
                String.valueOf(vendas.get(i).getDataVenda())});

        }
        return listaVendas;

    }
     public int consultarID() {
        VendaDAO vendas = new VendaDAO();
        return vendas.consultarID();
    }
     
}
