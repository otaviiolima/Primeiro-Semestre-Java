import java.util.Scanner;

public class Questão6Atividade1 {
    static void main() {
        double desconto, valorTotal;
        Scanner scanner  = new Scanner(System.in);

        // O usuário vai digitar o valor da sua compra.

        System.out.println("Quanto foi o valor total da compra ?");
        double valorDaCompra = scanner.nextDouble();

        desconto = 500 * 0.1;
        valorTotal = valorDaCompra - desconto;

        // Aqui o programa vai dar um desconto de 10% se a compra do usuário foi igual ou maior que 500.
        // Caso o contrário, o usuário não vai obter o desconto.

        if (valorDaCompra >= 500) {
            System.out.println("O valor do desconto da sua compra é: " + desconto);
            System.out.println("O valor total da compra com desconto é: " + valorTotal);

        } else {
            System.out.println("Você não obteve desconto na sua compra.");
        }

    }
}
