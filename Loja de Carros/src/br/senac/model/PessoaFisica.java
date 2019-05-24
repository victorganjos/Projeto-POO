package br.senac.model;

import java.util.Date;

/**
 * @author victor.ganjos
 */
public class PessoaFisica extends Cliente {

    private long cpf;
    private long rg;
    private Date dataNascimento;
    private final String tipo = "pf";

    public PessoaFisica(long cpf, long rg, Date dataNascimento, int id, int numeroResidencia, String nome, String endereco, String bairro, String cidade, String estado, String telefone, long cep) {
        super(id, numeroResidencia, nome, endereco, bairro, cidade, estado, telefone, cep);
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }

    public PessoaFisica(long cpf, long rg, Date dataNascimento, int numeroResidencia, String nome, String endereco, String bairro, String cidade, String estado, String telefone, long cep) {
        super(numeroResidencia, nome, endereco, bairro, cidade, estado, telefone, cep);
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }

    public PessoaFisica() {
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getRg() {
        return rg;
    }

    public void setRg(long rg) {
        this.rg = rg;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTipo() {
        return tipo;
    }
    
    
    
}
