import java.util.Scanner;

public class Questão3Atividade1 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        // o Usuário vai digitar um número.

        System.out.println("Digite um número");
        int numero = scanner.nextInt();

        // O programa verifica se o resto da divisão do número por 2 é igual a 0
        // se for, o número é par, se não, o número é ímpar.


        if (numero %2 == 0 ) {
            System.out.println("Par!");
        } else {
            System.out.println("Ímpar!");
            
        }

    }

}
