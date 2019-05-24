package br.senac.controller;

import br.senac.dao.PessoaFisicaDAO;
import br.senac.model.PessoaFisica;
import java.util.Date;
import java.util.List;

/*
 * @author victor.ganjos
 */
public class PessoaFisicaController {

    public static void salvar(long cpf, long rg, Date dataNascimento, int numeroResidencia, String nome, String endereco, String bairro, String cidade, String estado, String telefone, long cep) {
        PessoaFisica p = new PessoaFisica(cpf, rg, dataNascimento, numeroResidencia, nome, endereco, bairro, cidade, estado, telefone, cep);
        PessoaFisicaDAO cliente = new PessoaFisicaDAO();
        cliente.salvar(p);
    }

    public static void atualizar(long cpf, long rg, Date dataNascimento, int id, int numeroResidencia, String nome, String endereco, String bairro, String cidade, String estado, String telefone, long cep) {
        PessoaFisica p = new PessoaFisica(cpf, rg, dataNascimento, id, numeroResidencia, nome, endereco, bairro, cidade, estado, telefone, cep);
        PessoaFisicaDAO cliente = new PessoaFisicaDAO();
        cliente.atualizar(p);
    }

    public static void excluir(int id) {
        PessoaFisicaDAO cliente = new PessoaFisicaDAO();
        cliente.deletar(id);
    }

    public static List<PessoaFisica> consultarPorNome(String nome) {
        PessoaFisicaDAO cliente = new PessoaFisicaDAO();
        return cliente.consultarPorNome(nome);
    }

    public static List<PessoaFisica> consultar() {
        PessoaFisicaDAO cliente = new PessoaFisicaDAO();
        return cliente.consultar();
    }

    public static List<PessoaFisica> consultarPorId(int id) {
        PessoaFisicaDAO cliente = new PessoaFisicaDAO();
        return cliente.consultarPorId(id);
    }

}
