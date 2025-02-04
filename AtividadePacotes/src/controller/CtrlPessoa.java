package controller;

import model.Pessoa;
import model.PessoaDAO;

public class CtrlPessoa {
    private PessoaDAO pessoaDAO;

    public CtrlPessoa() {
        this.pessoaDAO = new PessoaDAO();
    }

    public void cadastrarPessoa(String nome, int idade) {
        // Verifica se o nome é nulo ou vazio
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Não é possível salvar uma pessoa com nome nulo ou vazio.");
        }

        // Cria uma instância de Pessoa com os dados fornecidos
        Pessoa pessoa = new Pessoa(nome, idade);

        // Aciona o método salvar da classe PessoaDAO
        pessoaDAO.salvar(pessoa);
    }
}