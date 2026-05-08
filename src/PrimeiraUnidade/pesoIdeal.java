import java.util.Scanner;

public class pesoIdeal {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        // O usuário vai informar seu gênero e sua altura.

        System.out.println("Informe seu gênero (M/F): ");
        char sexo = scanner.next().charAt(0);

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        // Aqui o programar vai calcular e dizer seu peso ideal.
        // Se for masculino, ele vai utilizar a seguinte fórmula: (72.7 * altura) – 58.

        if (sexo == 'M' || sexo == 'm') {
            double peso = (72.7 * altura) - 58;
            System.out.printf("Seu peso ideal é: %.2f\n", peso);

            // Caso for feminino, ele vai utilizar outra fórmula: (62.1 * altura) – 44.7.

        } else if (sexo == 'F' || sexo == 'f') {
            double peso = (62.1 * altura) - 44.7;
            System.out.printf("Seu peso ideal é: %.2f\n", peso);

        } else {
            System.out.println("Gênero inválido!");
        }

    }
}
