package br.senac.controller;

import br.senac.dao.PessoaFisicaDAO;
import br.senac.model.PessoaFisica;
import java.util.ArrayList;
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

    public static ArrayList<String[]> consulta() {
        List<PessoaFisica> cliente = new PessoaFisicaDAO().consultar();
        ArrayList<String[]> listaClientes = new ArrayList<>();

        for (int i = 0; i < cliente.size(); i++) {
            listaClientes.add(new String[]{String.valueOf(cliente.get(i).getId()),
                cliente.get(i).getNome(), String.valueOf(cliente.get(i).getCpf()),
                String.valueOf(cliente.get(i).getRg()),
                cliente.get(i).getTelefone(),
                String.valueOf(cliente.get(i).getEndereco()),
                String.valueOf(cliente.get(i).getNumeroResidencia()),
                String.valueOf(cliente.get(i).getEstado()),
                String.valueOf(cliente.get(i).getCidade()),
                String.valueOf(cliente.get(i).getCep()),
                String.valueOf(cliente.get(i).getDataNascimento())});

        }
        return listaClientes;

    }

    public static ArrayList<String[]> consultaPorNome(String pNome) {
        List<PessoaFisica> cliente = new PessoaFisicaDAO().consultarPorNome(pNome);

        ArrayList<String[]> listaClientes = new ArrayList<>();

        for (int i = 0; i < cliente.size(); i++) {
            listaClientes.add(new String[]{String.valueOf(cliente.get(i).getId()), cliente.get(i).getNome(), String.valueOf(cliente.get(i).getCpf()), String.valueOf(cliente.get(i).getRg()), cliente.get(i).getTelefone()});

        }

        return listaClientes;

    }

}
