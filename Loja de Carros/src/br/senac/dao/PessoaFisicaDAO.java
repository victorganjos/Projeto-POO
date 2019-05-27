package br.senac.dao;

import br.senac.connection.ConnectionFactory;
import br.senac.model.PessoaFisica;
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
public class PessoaFisicaDAO {
    
    public void salvar(PessoaFisica pf) {
        Connection con = ConnectionFactory.obterConexao();
        PreparedStatement stmt = null;
          
        try {            
            stmt = con.prepareStatement("INSERT INTO CLIENTE(nome,cpf,rg,telefone,endereco,"
                    + "numero_residencia,estado,cidade,bairro,cep,data_nascimento,tipo) VALUE (?,?,?,?,?,?,?,?,?,?,?,?);");
            stmt.setString(1, pf.getNome());
            stmt.setLong(2, pf.getCpf());
            stmt.setLong(3, pf.getRg());
            stmt.setString(4, pf.getTelefone());
            stmt.setString(5, pf.getEndereco());
            stmt.setInt(6, pf.getNumeroResidencia());
            stmt.setString(7, pf.getEstado());
            stmt.setString(8, pf.getCidade());
            stmt.setString(9, pf.getBairro());
            stmt.setLong(10, pf.getCep());
            stmt.setDate(11, new java.sql.Date(pf.getDataNascimento().getTime()));
            stmt.setString(12, pf.getTipo());
            
            stmt.executeUpdate();
            System.out.println("Salvar com sucesso!");
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(PessoaFisicaDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erro ao salvar");
        } finally {
            ConnectionFactory.fecharConexao(con, stmt);
        }

    }
    
    public List<PessoaFisica> consultar(){
        Connection con = ConnectionFactory.obterConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<PessoaFisica> clientes = new ArrayList<>();
        
        
        try{
            stmt = con.prepareStatement("SELECT * FROM CLIENTE WHERE TIPO = 'pf'");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                PessoaFisica pf = new PessoaFisica();
                
                pf.setId(rs.getInt("id"));
                pf.setNome(rs.getString("nome"));
                pf.setCpf(rs.getLong("cpf"));
                pf.setRg(rs.getLong("rg"));
                pf.setTelefone(rs.getString("telefone"));
                pf.setEndereco(rs.getString("endereco"));
                pf.setNumeroResidencia(rs.getInt("numero_residencia"));
                pf.setEstado(rs.getString("estado"));
                pf.setCidade(rs.getString("cidade"));
                pf.setBairro(rs.getString("bairro"));
                pf.setCep(rs.getLong("cep"));
                pf.setDataNascimento(rs.getDate("data_nascimento"));
                
                clientes.add(pf);
            }
            
        }
        catch(SQLException ex){
           Logger.getLogger(PessoaFisicaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            ConnectionFactory.fecharConexao(con,stmt,rs);
        }
       return clientes; 
    }
    
    public List<PessoaFisica> consultarPorNome(String nome){
        Connection con = ConnectionFactory.obterConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<PessoaFisica> clientes = new ArrayList<>();
        
        
        try{
            stmt = con.prepareStatement("SELECT * FROM CLIENTE WHERE nome LIKE ? AND TIPO = 'pf';");
            stmt.setString(1,"%"+nome+"%");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                PessoaFisica pf = new PessoaFisica();
                
                pf.setId(rs.getInt("id"));
                pf.setNome(rs.getString("nome"));
                pf.setCpf(rs.getLong("cpf"));
                pf.setRg(rs.getLong("rg"));
                pf.setTelefone(rs.getString("telefone"));
                pf.setEndereco(rs.getString("endereco"));
                pf.setNumeroResidencia(rs.getInt("numero_residencia"));
                pf.setEstado(rs.getString("estado"));
                pf.setCidade(rs.getString("cidade"));
                pf.setBairro(rs.getString("bairro"));
                pf.setCep(rs.getLong("cep"));
                pf.setDataNascimento(rs.getDate("data_nascimento"));
                
                clientes.add(pf);
            }
            
        }
        catch(SQLException ex){
           Logger.getLogger(PessoaFisicaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            ConnectionFactory.fecharConexao(con,stmt,rs);
        }
       return clientes; 
    }
    
    public List<PessoaFisica> consultarPorId(int id){
        Connection con = ConnectionFactory.obterConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<PessoaFisica> clientes = new ArrayList<>();
        
        
        try{
            stmt = con.prepareStatement("SELECT * FROM CLIENTE WHERE id LIKE ? AND TIPO = 'pf';");
            stmt.setString(1,""+id+"");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                PessoaFisica pf = new PessoaFisica();           
                pf.setId(rs.getInt("id"));
                pf.setNome(rs.getString("nome"));
                pf.setCpf(rs.getLong("cpf"));
                pf.setRg(rs.getLong("rg"));
                pf.setTelefone(rs.getString("telefone"));
                pf.setEndereco(rs.getString("endereco"));
                pf.setNumeroResidencia(rs.getInt("numero_residencia"));
                pf.setEstado(rs.getString("estado"));
                pf.setCidade(rs.getString("cidade"));
                pf.setBairro(rs.getString("bairro"));
                pf.setCep(rs.getLong("cep"));
                pf.setDataNascimento(rs.getDate("data_nascimento"));
                
                clientes.add(pf);
            }
            
        }
        catch(SQLException ex){
           Logger.getLogger(PessoaFisicaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            ConnectionFactory.fecharConexao(con,stmt,rs);
        }
       return clientes; 
    }
    
    public void atualizar(PessoaFisica pf){
        Connection con = ConnectionFactory.obterConexao();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("UPDATE CLIENTE SET nome = ?,cpf = ?,rg = ?,telefone = ?,endereco = ?,numero_residencia = ?,estado = ?,cidade = ?,bairro = ?,cep = ?,data_nascimento = ?,tipo = ? WHERE id = ?");
            
            stmt.setString(1, pf.getNome());
            stmt.setLong(2, pf.getCpf());
            stmt.setLong(3, pf.getRg());
            stmt.setString(4, pf.getTelefone());
            stmt.setString(5, pf.getEndereco());
            stmt.setInt(6, pf.getNumeroResidencia());
            stmt.setString(7, pf.getEstado());
            stmt.setString(8, pf.getCidade());
            stmt.setString(9, pf.getBairro());
            stmt.setLong(10, pf.getCep());
            stmt.setDate(11, new java.sql.Date(pf.getDataNascimento().getTime()));
            stmt.setString(12, pf.getTipo());
            stmt.setInt(13,pf.getId());
            
            stmt.executeUpdate();
        }
        catch(SQLException ex){
            Logger.getLogger(PessoaFisicaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            ConnectionFactory.fecharConexao(con,stmt);
        }
    }
    
    public void deletar(int id){
        Connection con = ConnectionFactory.obterConexao();
        PreparedStatement stmt = null;
        
        try{
           stmt = con.prepareStatement("DELETE FROM CLIENTE WHERE id = ?;");
           
           stmt.setInt(1, id);
           
           stmt.executeUpdate();
        }
        catch(SQLException ex){
            Logger.getLogger(PessoaFisicaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            ConnectionFactory.fecharConexao(con,stmt);
        }
    }
    
    public static String consultaClienteVenda(long cpf){
        
        Connection con = ConnectionFactory.obterConexao(); 
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean result = false;
        String aux = null;
        
        try {
            stmt = con.prepareStatement("SELECT nome FROM cliente WHERE id LIKE ? AND TIPO = 'pf';");
            stmt.setString(1, ""+cpf+"");
            rs = stmt.executeQuery();

            if(rs.next()){
                aux = rs.getString("nome");
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(PessoaFisicaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            ConnectionFactory.fecharConexao(con, stmt, rs);
        }
        return aux;
    }
 
}
