import java.util.Scanner;

public class Questão7Atividade1 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        // O usuário vai digitar um número

        System.out.println("Digite um número: ");
        int num = scanner.nextInt();

        // Se o número for par, o programa vai somar o número informado pelo usuário com 5.
        // Caso for ímpar, o programar vai somar o número informado pelo usuário com 8.

        if (num % 2 == 0) {
            System.out.println(num + 5);
        } else {
            System.out.println(num + 8);

        }
    }
}