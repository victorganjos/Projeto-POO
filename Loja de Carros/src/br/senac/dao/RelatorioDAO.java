/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.dao;

import br.senac.connection.ConnectionFactory;
import br.senac.model.Relatorio;
import br.senac.view.RelatorioView;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fabio
 */
public class RelatorioDAO {
    public static ArrayList<Relatorio> read(String dataInicio, String dataFim) throws ParseException{
        
        Connection con = ConnectionFactory.obterConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        ArrayList<Relatorio> listaRelatorio = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT v.id,c.nome, v.valor_total FROM venda as v Join cliente as c on fk_cliente = c.id  WHERE data_venda Between ? AND ?");
            
            stmt.setDate(1, java.sql.Date.valueOf(new RelatorioView().dataFormato(dataInicio)));
            stmt.setDate(2, java.sql.Date.valueOf(new RelatorioView().dataFormato(dataFim)));
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
            
                Relatorio relatorio = new Relatorio();
             
                relatorio.setId(rs.getInt("v.Id"));
                relatorio.setNome(rs.getString("c.nome"));
                relatorio.setValorTotal(rs.getDouble("v.valor_total"));
                listaRelatorio.add(relatorio);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(RelatorioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            ConnectionFactory.fecharConexao(con, stmt, rs);
        }
        return listaRelatorio;
    }
}
