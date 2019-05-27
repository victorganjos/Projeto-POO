package br.senac.controller;

import br.senac.dao.PessoaJuridicaDAO;
import br.senac.model.PessoaJuridica;
import java.util.ArrayList;
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
    
    public static ArrayList<String[]> consulta() {
        List<PessoaJuridica> cliente = new PessoaJuridicaDAO().consultar();
        ArrayList<String[]> listaClienteJuridico = new ArrayList<>();
        for (int i = 0; i < cliente.size(); i++) {
            listaClienteJuridico.add(new String[]{String.valueOf(cliente.get(i).getId()),
                cliente.get(i).getNome(), cliente.get(i).getNomeFantasia(),
                String.valueOf(cliente.get(i).getCnpj()),
                cliente.get(i).getTelefone(),
                String.valueOf(cliente.get(i).getEndereco()),
                String.valueOf(cliente.get(i).getNumeroResidencia()),
                String.valueOf(cliente.get(i).getEstado()),
                String.valueOf(cliente.get(i).getCidade()),
                String.valueOf(cliente.get(i).getBairro()),
                String.valueOf(cliente.get(i).getCep()),});

        }
        return listaClienteJuridico;

    }
    
    public static ArrayList<String[]> consultaPorNome(String pNome) {
        List<PessoaJuridica> cliente = new PessoaJuridicaDAO().consultarPorNome(pNome);

        ArrayList<String[]> listaClientes = new ArrayList<>();

        for (int i = 0; i < cliente.size(); i++) {
            listaClientes.add(new String[]{String.valueOf(cliente.get(i).getId()), cliente.get(i).getNome(), cliente.get(i).getNomeFantasia(), String.valueOf(cliente.get(i).getCnpj()), cliente.get(i).getTelefone()});

        }

        return listaClientes;

    }
    
    public  static String consultarPorCNPJString(long cnpj){
         PessoaJuridicaDAO cliente = new  PessoaJuridicaDAO();
        return cliente.consultaClienteVenda(cnpj);
    }
    
    public int consultarPorCPF(long cnpj){
         PessoaJuridicaDAO cliente = new  PessoaJuridicaDAO();
        return cliente.consultarPorCNPJ(cnpj);
    }
}
