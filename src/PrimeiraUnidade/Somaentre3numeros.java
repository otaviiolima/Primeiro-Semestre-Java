import java.util.Scanner;

public class Somaentre3numeros {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        // O usuário vai digitar os três números.

        System.out.println("Digite o primeiro número: ");
        int numA = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int numB = scanner.nextInt();

        System.out.println("Digite o terceiro número: ");
        int numC = scanner.nextInt();

        // Aqui o programa vai somar o primeiro (numA) e segundo número (numB)
        // e vai dizer se é maior ou menor que o terceiro número (numC).


        if (numA + numB > numC) {
            System.out.println("A soma entre os dois números é maior que C!");
        } else if (numA + numB <= numC) {
            System.out.println("A soma entre os dois números não é maior que C!");
        }

    }
}
