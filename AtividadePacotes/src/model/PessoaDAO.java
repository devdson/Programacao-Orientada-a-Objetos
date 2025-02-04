package model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PessoaDAO {
    public void salvar(Pessoa pessoa) {
        // Define o nome do arquivo
        String nomeArquivo = "pessoas.txt";

        // Tenta escrever no arquivo
        try (FileWriter fileWriter = new FileWriter(nomeArquivo, true);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {
            // Escreve o nome da pessoa no arquivo
            printWriter.println(pessoa.getNome());
            System.out.println("Nome salvo no arquivo: " + pessoa.getNome());
        } catch (IOException e) {
            // Captura e exibe erros de I/O
            System.err.println("Erro ao salvar no arquivo: " + e.getMessage());
        }
    }
}