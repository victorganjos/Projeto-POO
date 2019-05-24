package br.senac.controller;

import br.senac.dao.UsuarioDAO;
import br.senac.model.Usuario;
import java.util.List;

/**
 * @author victor.ganjos
 */
public class UsuarioController {
   public void salvar(String nome, String username, String senha) {
        Usuario u = new Usuario(nome,username,senha);
        UsuarioDAO usuario = new UsuarioDAO();
        usuario.salvar(u);
    }

    public void atualizar(int id, String nome, String username, String senha) {
        Usuario u = new Usuario(id, nome,username,senha);
        UsuarioDAO usuario = new UsuarioDAO();
        usuario.atualizar(u);
    }

    public void excluir(int id) {
        UsuarioDAO usuario = new UsuarioDAO();
        usuario.deletar(id);
    }

    public boolean consultarPorUsername(String username, String senha) {
        UsuarioDAO usuario = new UsuarioDAO();
        return usuario.consultarPorUsername(username,senha);
    }

    public  List<Usuario> consultar() {
        UsuarioDAO usuario = new UsuarioDAO();
        return usuario.consultar();
    }

    public List<Usuario> consultarPorId(int id) {
        UsuarioDAO usuario = new UsuarioDAO();
        return usuario.consultarPorId(id);
    }   
}
