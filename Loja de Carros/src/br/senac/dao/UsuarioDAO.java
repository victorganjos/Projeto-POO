package br.senac.dao;

import br.senac.connection.ConnectionFactory;
import br.senac.model.Produto;
import br.senac.model.Usuario;
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
public class UsuarioDAO {

    public void salvar(Usuario u) {
        Connection con = ConnectionFactory.obterConexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO USUARIO(nome,username,senha) VALUE (?,?,?);");

            stmt.setString(1, u.getNome());
            stmt.setString(2, u.getUsername());
            stmt.setString(3, u.getSenha());

            stmt.executeUpdate();
            System.out.println("Salvar com sucesso!");
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erro ao salvar");
        } finally {
            ConnectionFactory.fecharConexao(con, stmt);
        }

    }

    public List<Usuario> consultar() {
        Connection con = ConnectionFactory.obterConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Usuario> usuarios = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM USUARIO;");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Usuario u = new Usuario();

                u.setId(rs.getInt("id"));
                u.setNome(rs.getString("nome"));
                u.setUsername(rs.getString("username"));
                u.setSenha(rs.getString("senha"));

                usuarios.add(u);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.fecharConexao(con, stmt, rs);
        }
        return usuarios;
    }

    public boolean consultarPorUsername(String username, String senha) {
        Connection con = ConnectionFactory.obterConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean consulta = false;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM USUARIO WHERE username LIKE ?;");
            stmt.setString(1,""+username+"");
            rs = stmt.executeQuery();
            String user ="" ;
            String sen ="";
            
             while (rs.next()) {
                user = rs.getString("username");
                sen = rs.getString("senha");
            }
            
            if(user.equals(username)&& sen.equals(senha)){
            consulta=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.fecharConexao(con, stmt, rs);
        }
        return consulta;
    }

    public List<Usuario> consultarPorId(int id) {
        Connection con = ConnectionFactory.obterConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Usuario> usuarios = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM USUARIO WHERE id LIKE ?;");
            stmt.setString(1, "" + id + "");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Usuario u = new Usuario();

                u.setId(rs.getInt("id"));
                u.setNome(rs.getString("nome"));
                u.setUsername(rs.getString("username"));
                u.setSenha(rs.getString("senha"));

                usuarios.add(u);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.fecharConexao(con, stmt, rs);
        }
        return usuarios;
    }

    public void atualizar(Usuario u) {
        Connection con = ConnectionFactory.obterConexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE USUARIO SET nome = ?,username = ?,senha = ? WHERE id = ?");

            stmt.setString(1, u.getNome());
            stmt.setString(2, u.getUsername());
            stmt.setString(3, u.getSenha());
            stmt.setInt(4, u.getId());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.fecharConexao(con, stmt);
        }
    }

    public void deletar(int id) {
        Connection con = ConnectionFactory.obterConexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM USUARIO WHERE id = ?;");

            stmt.setInt(1, id);

            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.fecharConexao(con, stmt);
        }
    }
}
