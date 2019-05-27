/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.exceptios;

import java.util.ArrayList;
import javax.swing.JTextField;


/**
 *
 * @author Fabio
 */
public class Exceptions  {
    public static ArrayList<String> mensagensErro = new ArrayList<>();

    public static ArrayList<String> getMensagensErro() {
        return mensagensErro;
    }
    
    /**
     * 
     * @param txt pelo JtextField
     * @throws IllegalArgumentException
     */
  public static void validarCampoTexto(JTextField txt){
        
        
        try{
            if(txt.getText().equals("")){
                throw new IllegalArgumentException();
            }
               // txt.setBackground(Color.white);     
                txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));   
        }
        catch (IllegalArgumentException e){
            mensagensErro.add("Erro 1");
            //txt.setBackground(Color.red);
            txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0,0), 1, true));
            
        }

    }
    /**
     * 
     * @param txt pelo JtextField
     * @throws NumberFormatException
     * @throws IllegalArgumentException
     */
    public static void validarNumero(JTextField txt) {
        
         try{

            if(txt.getText().equals("")){
                  
                 throw new IllegalArgumentException();
             }
            int valorConvertido = Integer.parseInt(txt.getText());
            txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true)); 
        }
        catch (NumberFormatException e)
        {
           
           mensagensErro.add("Erro 2");
           txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0,0), 1, true));
           
        }
        catch (IllegalArgumentException e)
        {
           mensagensErro.add("Erro 3");
           txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0,0), 1, true));
        }
         
    }
    /**
     *
     * @param txt pelo JtextField
     * @throws NumberFormatException
     * @throws IllegalArgumentException
     */
    public static void validarNumeroLong(JTextField txt) {
        
         try{

            if(txt.getText().equals("")){
                  
                 throw new IllegalArgumentException();
             }
            long valorConvertido = Long.parseLong(txt.getText());
            txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true)); 
        }
        catch (NumberFormatException e)
        {
           
           mensagensErro.add("Erro 2");
           txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0,0), 1, true));
           
        }
        catch (IllegalArgumentException e)
        {
           mensagensErro.add("Erro 3");
           txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0,0), 1, true));
        }
         
    }
    /**
     * 
     * @param txt pelo JtextField
     * @throws NumberFormatException
     * @throws IllegalArgumentException
     * 
     */
    public static void validarDecimal(JTextField txt) {
        
         try{
             
             if(txt.getText().equals("")){
                 throw new IllegalArgumentException();
             }
             
             double valor = Double.parseDouble(txt.getText().replace(',', '.'));
             txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true)); 
        }
        catch (NumberFormatException e)
        {
           mensagensErro.add("Erro 4");
           txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0,0), 1, true));
           
        }
        catch (IllegalArgumentException e)
        {
           mensagensErro.add("Erro 5");
           txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0,0), 1, true));
        }
        catch(Exception e)
        {
           mensagensErro.add("Erro 6");
           txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0,0), 1, true));
           
        }
         
    }
    public static void limparMensagesErro() {
        
        mensagensErro.clear();
    }
    

}
