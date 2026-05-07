import java.util.Scanner;

public class Questão1For {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scanner.nextInt();
        int i;

        for (i=0; i<=num; i++) {
            System.out.println(i);
        }
    }
}
