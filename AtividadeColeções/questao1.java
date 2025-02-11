import java.util.HashSet;
import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        HashSet<String> conjunto = new HashSet<>();
        
        try (Scanner scanner = new Scanner(System.in)) {
           
            while (true) {
                String entrada = scanner.nextLine();
                if (entrada.equals("fim")) {
                    break;
                }
                conjunto.add(entrada);
            }
            
            
            while (true) {
                String entrada = scanner.nextLine();
                if (entrada.equals("fim")) {
                    break;
                }
                if (conjunto.contains(entrada)) {
                    System.out.println(entrada + " localizado");
                } else {
                    System.out.println(entrada + " nao localizado");
                }
            }
        }
    }
}
