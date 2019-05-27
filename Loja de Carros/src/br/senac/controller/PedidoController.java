package br.senac.controller;

import br.senac.dao.PedidoDAO;
import br.senac.model.ItemVenda;
import br.senac.model.Pedido;
import java.util.ArrayList;
import java.util.List;

/**
 * @author victor.ganjos
 */
public class PedidoController {

    public void salvar(int id_venda,int id_prod, double valorUnit) {
        PedidoDAO pedidos = new PedidoDAO();
        pedidos.salvar(id_venda, id_prod,valorUnit);
    }

    public static void excluir(int id) {
         PedidoDAO pedidos = new PedidoDAO();
        pedidos.deletar(id);
    }

    public List<Pedido> consultar() {
        PedidoDAO pedidos = new PedidoDAO();
        return pedidos.consultar();
    }

    public static List<Pedido> consultarPorId(int id) {
        PedidoDAO pedidos = new PedidoDAO();
       return pedidos.consultarPorId(id);
    }

    public static ArrayList<String[]> consulta() {
        List<Pedido> pedidos = new PedidoDAO().consultar();
        ArrayList<String[]> listaPedidos = new ArrayList<>();

        for (int i = 0; i < pedidos.size(); i++) {
            listaPedidos.add(new String[]{String.valueOf(pedidos.get(i).getId()),
                String.valueOf(pedidos.get(i).getId_venda()),
                String.valueOf(pedidos.get(i).getId_itemvenda())});

        }
        return listaPedidos;

    }
}
