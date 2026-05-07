import java.util.Scanner;

public class Questao1While {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scanner.nextInt();
        int i = 1;

        while (i <= num) {
            System.out.println(i);
            i++;
        }
    }
}
