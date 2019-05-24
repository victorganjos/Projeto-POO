package br.senac.controller;

import br.senac.dao.PessoaJuridicaDAO;
import br.senac.model.PessoaJuridica;
import java.util.List;

/*
 * @author victor.ganjos
 */
public class PessoaJuridicaController {
    public static void salvar(long cnpj, String nomeFantasia, int numeroResidencia, String nome, String endereco, String bairro, String cidade, String estado, String telefone, long cep) {
        PessoaJuridica p = new PessoaJuridica(cnpj,nomeFantasia,numeroResidencia,nome,endereco,bairro,cidade,estado,telefone,cep);
        PessoaJuridicaDAO cliente = new PessoaJuridicaDAO();
        cliente.salvar(p);
    }

    public static void atualizar(long cnpj, String nomeFantasia,int id, int numeroResidencia, String nome, String endereco, String bairro, String cidade, String estado, String telefone, long cep) {
        PessoaJuridica p = new PessoaJuridica(cnpj,nomeFantasia,id,numeroResidencia,nome,endereco,bairro,cidade,estado,telefone,cep);
        PessoaJuridicaDAO cliente = new PessoaJuridicaDAO();
        cliente.atualizar(p);
    }

    public static void excluir(int id) {
        PessoaJuridicaDAO cliente = new PessoaJuridicaDAO();
        cliente.deletar(id);
    }

    public static List<PessoaJuridica> consultarPorNome(String nome) {
        PessoaJuridicaDAO cliente = new PessoaJuridicaDAO();
        return cliente.consultarPorNome(nome);
    }

    public static List<PessoaJuridica> consultar() {
        PessoaJuridicaDAO cliente = new PessoaJuridicaDAO();
        return cliente.consultar();
    }

    public static List<PessoaJuridica> consultarPorId(int id) {
        PessoaJuridicaDAO cliente = new PessoaJuridicaDAO();
        return cliente.consultarPorId(id);
    }

}
