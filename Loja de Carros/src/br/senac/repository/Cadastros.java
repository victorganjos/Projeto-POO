package br.senac.repository;

import java.util.List;

/**
 * @author victor.ganjos
 */
public  interface Cadastros {
    public abstract void incluir();
    public abstract void alterar();
    public abstract List Consultar();
    public abstract void remover();
}
