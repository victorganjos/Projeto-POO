package br.senac.dao;

import br.senac.connection.ConnectionFactory;
import br.senac.model.PessoaJuridica;
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
public class PessoaJuridicaDAO {

    public void salvar(PessoaJuridica pj) {
        Connection con = ConnectionFactory.obterConexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO CLIENTE(nome,nome_fantasia,cnpj,telefone,endereco,"
                    + "numero_residencia,estado,cidade,bairro,cep,tipo) VALUE (?,?,?,?,?,?,?,?,?,?,?);");

            stmt.setString(1, pj.getNome());
            stmt.setString(2, pj.getNomeFantasia());
            stmt.setLong(3, pj.getCnpj());
            stmt.setString(4, pj.getTelefone());
            stmt.setString(5, pj.getEndereco());
            stmt.setInt(6, pj.getNumeroResidencia());
            stmt.setString(7, pj.getEstado());
            stmt.setString(8, pj.getCidade());
            stmt.setString(9, pj.getBairro());
            stmt.setLong(10, pj.getCep());
            stmt.setString(11, pj.getTipo());

            stmt.executeUpdate();
            System.out.println("Salvar com sucesso!");
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(PessoaJuridicaDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erro ao salvar");
        } finally {
            ConnectionFactory.fecharConexao(con, stmt);
        }

    }

    public List<PessoaJuridica> consultar() {
        Connection con = ConnectionFactory.obterConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<PessoaJuridica> clientes = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM CLIENTE WHERE TIPO = 'pj'");
            rs = stmt.executeQuery();

            while (rs.next()) {
                PessoaJuridica pj = new PessoaJuridica();

                pj.setId(rs.getInt("id"));
                pj.setNome(rs.getString("nome"));
                pj.setNomeFantasia(rs.getString("nome_fantasia"));
                pj.setCnpj(rs.getLong("cnpj"));
                pj.setTelefone(rs.getString("telefone"));
                pj.setEndereco(rs.getString("endereco"));
                pj.setNumeroResidencia(rs.getInt("numero_residencia"));
                pj.setEstado(rs.getString("estado"));
                pj.setCidade(rs.getString("cidade"));
                pj.setBairro(rs.getString("bairro"));
                pj.setCep(rs.getLong("cep"));

                clientes.add(pj);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PessoaJuridicaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.fecharConexao(con, stmt, rs);
        }
        return clientes;
    }

    public List<PessoaJuridica> consultarPorNome(String nome) {
        Connection con = ConnectionFactory.obterConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<PessoaJuridica> clientes = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM CLIENTE WHERE nome LIKE ? AND TIPO = 'pj';");
            stmt.setString(1, "%" + nome + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                PessoaJuridica pj = new PessoaJuridica();

                pj.setId(rs.getInt("id"));
                pj.setNome(rs.getString("nome"));
                pj.setNomeFantasia(rs.getString("nome_fantasia"));
                pj.setCnpj(rs.getLong("cnpj"));
                pj.setTelefone(rs.getString("telefone"));
                pj.setEndereco(rs.getString("endereco"));
                pj.setNumeroResidencia(rs.getInt("numero_residencia"));
                pj.setEstado(rs.getString("estado"));
                pj.setCidade(rs.getString("cidade"));
                pj.setBairro(rs.getString("bairro"));
                pj.setCep(rs.getLong("cep"));

                clientes.add(pj);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PessoaJuridicaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.fecharConexao(con, stmt, rs);
        }
        return clientes;
    }

    public List<PessoaJuridica> consultarPorId(int id) {
        Connection con = ConnectionFactory.obterConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<PessoaJuridica> clientes = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM CLIENTE WHERE id LIKE ? AND TIPO = 'pj';");
            stmt.setString(1, "" + id + "");
            rs = stmt.executeQuery();

            while (rs.next()) {
                PessoaJuridica pj = new PessoaJuridica();
                
                pj.setId(rs.getInt("id"));
                pj.setNome(rs.getString("nome"));
                pj.setNomeFantasia(rs.getString("nome_fantasia"));
                pj.setCnpj(rs.getLong("cnpj"));
                pj.setTelefone(rs.getString("telefone"));
                pj.setEndereco(rs.getString("endereco"));
                pj.setNumeroResidencia(rs.getInt("numero_residencia"));
                pj.setEstado(rs.getString("estado"));
                pj.setCidade(rs.getString("cidade"));
                pj.setBairro(rs.getString("bairro"));
                pj.setCep(rs.getLong("cep"));

                clientes.add(pj);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PessoaJuridicaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.fecharConexao(con, stmt, rs);
        }
        return clientes;
    }

    public void atualizar(PessoaJuridica pj) {
        Connection con = ConnectionFactory.obterConexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE CLIENTE SET nome = ?,nome_fantasia = ?,cnpj = ?,telefone = ?,endereco = ?,numero_residencia = ?,"
                    + "estado = ?,cidade = ?,bairro = ?,cep = ?,tipo = ? WHERE id = ?");

            stmt.setString(1, pj.getNome());
            stmt.setString(2, pj.getNomeFantasia());
            stmt.setLong(3, pj.getCnpj());
            stmt.setString(4, pj.getTelefone());
            stmt.setString(5, pj.getEndereco());
            stmt.setInt(6, pj.getNumeroResidencia());
            stmt.setString(7, pj.getEstado());
            stmt.setString(8, pj.getCidade());
            stmt.setString(9, pj.getBairro());
            stmt.setLong(10, pj.getCep());
            stmt.setString(11, pj.getTipo());
            stmt.setInt(12, pj.getId());
          

            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PessoaJuridicaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.fecharConexao(con, stmt);
        }
    }

    public void deletar(int id) {
        Connection con = ConnectionFactory.obterConexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM CLIENTE WHERE id = ?;");

            stmt.setInt(1, id);

            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PessoaJuridicaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.fecharConexao(con, stmt);
        }
    }
}
