/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.controller;

import br.senac.dao.RelatorioDAO;
import br.senac.model.Relatorio;
import java.text.ParseException;
import java.util.ArrayList;

/**
 *
 * @author Fabio
 */
public class RelatorioController {
    public static ArrayList<String[]> read(String dataInicio, String dataFim) throws ParseException{
    
        ArrayList<Relatorio> relatorio = RelatorioDAO.read(dataInicio, dataFim);
        ArrayList<String[]> listaRelatorio = new ArrayList<>();
        
        for (int i =0; i <relatorio.size(); i++){
            listaRelatorio.add(new String[]{ 
                String.valueOf(relatorio.get(i).getId()),
                String.valueOf(relatorio.get(i).getNome()),
                String.valueOf(relatorio.get(i).getValorTotal())});
            
        }
        return listaRelatorio;
    }
}
