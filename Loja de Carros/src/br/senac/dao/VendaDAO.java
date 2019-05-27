package br.senac.dao;

import br.senac.connection.ConnectionFactory;
import br.senac.model.Venda;
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
public class VendaDAO {

    public void salvar(Venda v) {
        Connection con = ConnectionFactory.obterConexao();
        PreparedStatement stmt = null;
        java.sql.Date data = new java.sql.Date(System.currentTimeMillis());
        try {
            stmt = con.prepareStatement("INSERT INTO VENDA(fk_cliente,valor_total,data_venda) VALUES (?,?,?);");

            stmt.setInt(1, v.getIdCliente());
            stmt.setDouble(2, v.getValor_total());
            stmt.setDate(3,data);

            stmt.executeUpdate();
            System.out.println("Salvar com sucesso!");
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erro ao salvar");
        } finally {
            ConnectionFactory.fecharConexao(con, stmt);
        }

    }

    public List<Venda> consultar() {
        Connection con = ConnectionFactory.obterConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Venda> vendas = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM VENDA;");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Venda v = new Venda();

                v.setId(rs.getInt("id"));
                v.setIdCliente(rs.getInt("fk_cliente"));
                v.setValorTotal(rs.getDouble("valor_total"));
                v.setDataVenda(rs.getDate("data_venda"));

                vendas.add(v);
            }

        } catch (SQLException ex) {
            Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.fecharConexao(con, stmt, rs);
        }
        return vendas;
    }

    public int consultarID() {
        Connection con = ConnectionFactory.obterConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        int id = -1;

        try {
            stmt = con.prepareStatement("SELECT MAX(ID) FROM VENDA;");
            rs = stmt.executeQuery();

            while (rs.next()) {
                id=(rs.getInt("MAX(ID)"));

            }

        } catch (SQLException ex) {
            Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.fecharConexao(con, stmt, rs);
        }
        return id;
    }

    public List<Venda> consultarPorId(int id) {
        Connection con = ConnectionFactory.obterConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Venda> vendas = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM VENDA WHERE id LIKE ?;");
            stmt.setString(1, "" + id + "");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Venda v = new Venda();

                v.setId(rs.getInt("id"));
                v.setIdCliente(rs.getInt("fk_cliente"));
                v.setValorTotal(rs.getDouble("valor_total"));
                v.setDataVenda(rs.getDate("data_venda"));

                vendas.add(v);
            }

        } catch (SQLException ex) {
            Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.fecharConexao(con, stmt, rs);
        }
        return vendas;
    }

    public void deletar(int id) {
        Connection con = ConnectionFactory.obterConexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM VENDA WHERE id = ?;");

            stmt.setInt(1, id);

            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.fecharConexao(con, stmt);
        }
    }
}
