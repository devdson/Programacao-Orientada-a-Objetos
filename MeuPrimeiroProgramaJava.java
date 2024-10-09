
import java.util.Scanner;

public class MeuPrimeiroProgramaJava {

    public static void main(String[] args) {
        
        // Ler dados da entrada padrão (teclado)
        Scanner sc = new Scanner(System.in);
        
        // Imprime na saída padrão (tela) o texto fornecido
        System.out.println("Qual seu nome?");
        
        // Aguarda o usuário digitar e armazena o texto em "nome"
        String nome = sc.nextLine();
        
        // Imprime na saída padrão (tela) o texto fornecido
        System.out.println("Seu nome é: " + nome);
        
        // Fecha a conexão com a entrada padrão
        sc.close();
    }
}
      