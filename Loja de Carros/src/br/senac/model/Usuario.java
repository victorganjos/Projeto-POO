    package br.senac.model;
/**
 * @author victor.ganjos
 */
public class Usuario {
    private int id;
    private String nome, username, senha;
    private String usuarioAtivo;
    public Usuario(int id, String nome, String username, String senha) {
        this.id = id;
        this.nome = nome;
        this.username = username;
        this.senha = senha;
        this.usuarioAtivo=nome;
    }

    public Usuario(String nome, String username, String senha) {
        this.nome = nome;
        this.username = username;
        this.senha = senha;
        this.usuarioAtivo=nome;
    }

    public Usuario() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsuarioAtivo() {
        return usuarioAtivo;
    }

    public void setUsuarioAtivo(String usuarioAtivo) {
        this.usuarioAtivo = usuarioAtivo;
    }
    
    
    
}
