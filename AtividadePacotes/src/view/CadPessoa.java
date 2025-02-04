package view;

import controller.CtrlPessoa;
import java.util.Scanner;

public class CadPessoa {
    public static void main(String[] args) {
        // Cria uma instância de CtrlPessoa
        CtrlPessoa controller = new CtrlPessoa();

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicita o nome do usuário
            System.out.print("Digite o nome da pessoa: ");
            String nome = scanner.nextLine();

            // Solicita a idade do usuário
            System.out.print("Digite a idade da pessoa: ");
            int idade = scanner.nextInt();

            // Tenta cadastrar a pessoa
            controller.cadastrarPessoa(nome, idade);
        } catch (IllegalArgumentException e) {
            // Captura e exibe a exceção caso o nome seja nulo ou vazio
            System.err.println("Erro: " + e.getMessage());
        } finally {
            // Fecha o scanner
            scanner.close();
        }
    }
}