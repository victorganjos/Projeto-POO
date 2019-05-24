package br.senac.model;
/**
 * @author victor.ganjos
 */
public class PessoaJuridica extends Cliente {
    private long cnpj;
    String nomeFantasia;
    private final String tipo = "pj";

    public PessoaJuridica(long cnpj, String nomeFantasia, int id, int numeroResidencia, String nome, String endereco, String bairro, String cidade, String estado, String telefone, long cep) {
        super(id, numeroResidencia, nome, endereco, bairro, cidade, estado, telefone, cep);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
    }

    public PessoaJuridica(long cnpj, String nomeFantasia, int numeroResidencia, String nome, String endereco, String bairro, String cidade, String estado, String telefone, long cep) {
        super(numeroResidencia, nome, endereco, bairro, cidade, estado, telefone, cep);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
    }

    public PessoaJuridica() {
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getTipo() {
        return tipo;
    }
    
    
}
