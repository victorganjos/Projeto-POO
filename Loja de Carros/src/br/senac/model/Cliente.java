package br.senac.model;
/**
 * @author victor.ganjos
 */
public class Cliente {
    private int id, numeroResidencia;
    private String nome,endereco, bairro, cidade, estado, telefone;
    private long cep;

    public Cliente(int id, int numeroResidencia, String nome, String endereco, String bairro, String cidade, String estado, String telefone, long cep) {
        this.id = id;
        this.numeroResidencia = numeroResidencia;
        this.nome = nome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
        this.cep = cep;
    }

    public Cliente(int numeroResidencia, String nome, String endereco, String bairro, String cidade, String estado, String telefone, long cep) {
        this.numeroResidencia = numeroResidencia;
        this.nome = nome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
        this.cep = cep;
    }

    public Cliente() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroResidencia() {
        return numeroResidencia;
    }

    public void setNumeroResidencia(int numeroResidencia) {
        this.numeroResidencia = numeroResidencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public long getCep() {
        return cep;
    }

    public void setCep(long cep) {
        this.cep = cep;
    }

    
    
}
