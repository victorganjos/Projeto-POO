package br.senac.controller;

import br.senac.dao.ItemVendaDAO;
import br.senac.model.ItemVenda;
import java.util.ArrayList;
import java.util.List;

/**
 * @author victor.ganjos
 */
public class ItemVendaController {

    public void salvar(int idProduto, double valorUnitario) {
        ItemVenda item = new ItemVenda(idProduto, valorUnitario);
        ItemVendaDAO it = new ItemVendaDAO();
        it.salvar(item);
    }

    public static void excluir(int id) {
       ItemVendaDAO item = new ItemVendaDAO();
        item.deletar(id);
    }

    public List<ItemVenda> consultar() {
        ItemVendaDAO item = new ItemVendaDAO();
        return item.consultar();
    }

    public static List<ItemVenda> consultarPorId(int id) {
        ItemVendaDAO item = new ItemVendaDAO();
       return item.consultarPorId(id);
    }

    public static ArrayList<String[]> consulta() {
        List<ItemVenda> itens = new ItemVendaDAO().consultar();
        ArrayList<String[]> listaItens = new ArrayList<>();

        for (int i = 0; i < itens.size(); i++) {
            listaItens.add(new String[]{String.valueOf(itens.get(i).getId()),
                String.valueOf(itens.get(i).getIdProduto()),
                String.valueOf(itens.get(i).getValorUnitario())});

        }
        return listaItens;

    }
    
}
