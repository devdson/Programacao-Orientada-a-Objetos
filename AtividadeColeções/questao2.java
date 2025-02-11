import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    numeros.add(scanner.nextInt());
                } else {
                    String entrada = scanner.next();
                    if (entrada.equals("fim")) {
                        break;
                    }
                    System.out.println("Entrada inválida: " + entrada);
                }
            }
        }
        
        Collections.sort(numeros);
        
        for (int num : numeros) {
            System.out.println(num);
        }
    }
}
