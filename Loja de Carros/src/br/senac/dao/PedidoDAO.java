package br.senac.dao;

import br.senac.connection.ConnectionFactory;
import br.senac.model.Pedido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author victor.ganjos
 */
public class PedidoDAO {

    public void salvar(int idVenda, int idItens, double valorUnitario) {
        int aux = 0;

        Connection con = ConnectionFactory.obterConexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO ITEMVENDA(fk_produto,valor_unitario) VALUES (?,?);");
            stmt.setInt(1, idItens);
            stmt.setDouble(2, valorUnitario);
            stmt.executeUpdate();
            System.out.println("Salvar com sucesso!");

            stmt = con.prepareStatement("SET @id_item = LAST_INSERT_ID();");
            stmt.executeUpdate();
            stmt = con.prepareStatement("INSERT INTO PEDIDO (fk_venda,fk_itemvenda) VALUES (?,@id_item);");
            stmt.setInt(1, idVenda);
            stmt.executeUpdate();
            System.out.println("Salvar com sucesso!");

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erro ao salvar");
        } finally {
            ConnectionFactory.fecharConexao(con, stmt);
        }
    }

    public List<Pedido> consultar() {
        Connection con = ConnectionFactory.obterConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Pedido> pedidos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM PEDIDO;");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Pedido p = new Pedido();

                p.setId(rs.getInt("id"));
                p.setId_venda(rs.getInt("fk_venda"));
                p.setId_itemvenda(rs.getInt("fk_itemvenda"));

                pedidos.add(p);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.fecharConexao(con, stmt, rs);
        }
        return pedidos;
    }

    public List<Pedido> consultarPorId(int id) {
        Connection con = ConnectionFactory.obterConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Pedido> pedidos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM PEDIDO WHERE id LIKE ?;");
            stmt.setString(1, "" + id + "");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Pedido p = new Pedido();

                p.setId(rs.getInt("id"));
                p.setId_venda(rs.getInt("fk_venda"));
                p.setId_itemvenda(rs.getInt("fk_itemvenda"));

                pedidos.add(p);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.fecharConexao(con, stmt, rs);
        }
        return pedidos;
    }

    public void deletar(int id) {
        Connection con = ConnectionFactory.obterConexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM PEDIDO WHERE id = ?;");

            stmt.setInt(1, id);

            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.fecharConexao(con, stmt);
        }
    }
}
