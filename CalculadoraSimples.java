import java.util.Scanner;

public class CalculadoraSimples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bem-vindo à calculadora simples!");
        
        // Entrada do primeiro número
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        
        // Entrada do operador
        System.out.print("Escolha a operação (+, -, *, /): ");
        char operador = scanner.next().charAt(0);
        
        // Entrada do segundo número
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        
        // Variável para armazenar o resultado
        double resultado = 0;
        
        // Verificação do operador e execução da operação
        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por zero não permitida.");
                    return;  // Encerra o programa se houver divisão por zero
                }
                break;
            default:
                System.out.println("Operador inválido.");
                return;  // Encerra o programa se o operador for inválido
        }
        
        // Exibe o resultado
        System.out.println("O resultado é: " + resultado);
        
        // Fecha o scanner
        scanner.close();
    }
}
