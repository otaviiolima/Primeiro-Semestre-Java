import java.util.Scanner;

public class verificadorIdade {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        // O usuário vai informar sua idade.

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        // Aqui o programa vai informar se ele é maior ou menor de idade.

        if (idade >= 18) {
            System.out.println("Maior de Idade!");
        } else if (idade < 18) {
            System.out.println("Menor de Idade!");

        }

    }
}
