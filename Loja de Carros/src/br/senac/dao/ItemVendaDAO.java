package br.senac.dao;

import br.senac.connection.ConnectionFactory;
import br.senac.model.ItemVenda;
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
public class ItemVendaDAO {

    public void salvar(ItemVenda i) {
        Connection con = ConnectionFactory.obterConexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO ITEMVENDA(fk_produto,valor_unitario) VALUE (?,?);");

            stmt.setInt(1, i.getIdProduto());
            stmt.setDouble(2, i.getValorUnitario());

            stmt.executeUpdate();
            System.out.println("Salvar com sucesso!");
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(ItemVendaDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erro ao salvar");
        } finally {
            ConnectionFactory.fecharConexao(con, stmt);
        }

    }

    public List<ItemVenda> consultar() {
        Connection con = ConnectionFactory.obterConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<ItemVenda> itens = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM ITEMVENDA;");
            rs = stmt.executeQuery();

            while (rs.next()) {
                ItemVenda i = new ItemVenda();

                i.setId(rs.getInt("id"));
                i.setIdProduto(rs.getInt("fk_produto"));
                i.setValorUnitario(rs.getDouble("valor_unitario"));
                
                itens.add(i);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ItemVendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.fecharConexao(con, stmt, rs);
        }
        return itens;
    }


    public List<ItemVenda> consultarPorId(int id) {
        Connection con = ConnectionFactory.obterConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<ItemVenda> itens = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM ITEMVENDA WHERE id LIKE ?;");
            stmt.setString(1, "" + id + "");
            rs = stmt.executeQuery();

            while (rs.next()) {
                ItemVenda i = new ItemVenda();

                i.setId(rs.getInt("id"));
                i.setIdProduto(rs.getInt("fk_produto"));
                i.setValorUnitario(rs.getDouble("valor_unitario"));
                
                itens.add(i);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ItemVendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.fecharConexao(con, stmt, rs);
        }
        return itens;
    }

    public void deletar(int id) {
        Connection con = ConnectionFactory.obterConexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM ITEMVENDA WHERE id = ?;");

            stmt.setInt(1, id);

            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ItemVendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.fecharConexao(con, stmt);
        }
    }
}
