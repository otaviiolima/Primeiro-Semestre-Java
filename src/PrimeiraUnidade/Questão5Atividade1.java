import java.util.Scanner;

public class Questão5Atividade1 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        // O usuário vai digitar um número.

        System.out.println("Informe um número: ");
        double num = scanner.nextDouble();

        // Se o número for positivo ele vai mostrar o dobro do número digitado.
        // caso seja negativo, vai mostrar o triplo.

        if (num > 0 ) {
            System.out.println(num * 2);
        } else {
            System.out.println(num * 3);

    }
}

}
