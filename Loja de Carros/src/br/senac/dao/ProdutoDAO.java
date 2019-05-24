package br.senac.dao;

import br.senac.connection.ConnectionFactory;
import br.senac.model.Produto;
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
public class ProdutoDAO {

    public void salvar(Produto p) {
        Connection con = ConnectionFactory.obterConexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO PRODUTO(modelo,marca,ano,cor,placa,valor_compra) VALUE (?,?,?,?,?,?);");

            stmt.setString(1, p.getModelo());
            stmt.setString(2, p.getMarca());
            stmt.setString(3, p.getAno());
            stmt.setString(4, p.getCor());
            stmt.setString(5, p.getPlaca());
            stmt.setDouble(6, p.getValorCompra());

            stmt.executeUpdate();
            System.out.println("Salvar com sucesso!");
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erro ao salvar");
        } finally {
            ConnectionFactory.fecharConexao(con, stmt);
        }

    }

    public List<Produto> consultar() {
        Connection con = ConnectionFactory.obterConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Produto> produtos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM PRODUTO;");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produto p = new Produto();

                p.setId(rs.getInt("id"));
                p.setModelo(rs.getString("modelo"));
                p.setMarca(rs.getString("marca"));
                p.setAno(rs.getString("ano"));
                p.setCor(rs.getString("cor"));
                p.setPlaca(rs.getString("placa"));
                p.setValorCompra(rs.getDouble("valor_compra"));

                produtos.add(p);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.fecharConexao(con, stmt, rs);
        }
        return produtos;
    }

    public List<Produto> consultarPorNome(String nome) {
        Connection con = ConnectionFactory.obterConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Produto> produtos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM PRODUTO WHERE nome LIKE ?;");
            stmt.setString(1, "%" + nome + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produto p = new Produto();

                p.setId(rs.getInt("id"));
                p.setModelo(rs.getString("modelo"));
                p.setMarca(rs.getString("marca"));
                p.setAno(rs.getString("ano"));
                p.setCor(rs.getString("cor"));
                p.setPlaca(rs.getString("placa"));
                p.setValorCompra(rs.getDouble("valor_compra"));

                produtos.add(p);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.fecharConexao(con, stmt, rs);
        }
        return produtos;
    }

    public List<Produto> consultarPorId(int id) {
        Connection con = ConnectionFactory.obterConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Produto> produtos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM PRODUTO WHERE id LIKE ?;");
            stmt.setString(1, "" + id + "");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produto p = new Produto();

                p.setId(rs.getInt("id"));
                p.setModelo(rs.getString("modelo"));
                p.setMarca(rs.getString("marca"));
                p.setAno(rs.getString("ano"));
                p.setCor(rs.getString("cor"));
                p.setPlaca(rs.getString("placa"));
                p.setValorCompra(rs.getDouble("valor_compra"));

                produtos.add(p);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.fecharConexao(con, stmt, rs);
        }
        return produtos;
    }

    public void atualizar(Produto p) {
        Connection con = ConnectionFactory.obterConexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE PRODUTO SET modelo = ?,marca = ?,ano = ?,cor = ?,placa = ?,valor_compra = ? WHERE id = ?");

            stmt.setString(1, p.getModelo());
            stmt.setString(2, p.getMarca());
            stmt.setString(3, p.getAno());
            stmt.setString(4, p.getCor());
            stmt.setString(5, p.getPlaca());
            stmt.setDouble(6, p.getValorCompra());
            stmt.setInt(7, p.getId());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.fecharConexao(con, stmt);
        }
    }

    public void deletar(int id) {
        Connection con = ConnectionFactory.obterConexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM PRODUTO WHERE id = ?;");

            stmt.setInt(1, id);

            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.fecharConexao(con, stmt);
        }
    }
}
