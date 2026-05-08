import java.util.Scanner;

public class SomaOuMultiplicacao {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        // o Usuário vai digitar dois números.

        System.out.println("Informe o primeiro número:");
        int A = scanner.nextInt();

        System.out.println("Informe outro número: ");
        int B = scanner.nextInt();

        // Se o Número A e B forem iguais, o programa vai somar, caso sejam diferentes, vai multiplicar.


        if (A==B) {
            System.out.println(" C = " + (A + B));
        } else {
            System.out.println(" C = " + (A * B));
            
        }


    }
}
