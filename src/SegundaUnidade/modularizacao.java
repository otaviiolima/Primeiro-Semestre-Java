package SegundaUnidade;
import java.util.Scanner;
public class modularizacao {

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // O usuário vai digitar dois números

        System.out.println("Digite um número: ");
        double numA = scanner.nextDouble();

        System.out.println("Digite outro número: ");
        double numB = scanner.nextDouble();

        // Aqui o usuário vai escolhar as opções dentro do menu.

        System.out.println("Escolha uma opção: ");
        System.out.println("1- Somar");
        System.out.println("2- Subtrair");
        System.out.println("3- Multiplicar");
        System.out.println("4- Dividir");

        int opcao = scanner.nextInt();
        scanner.close();

        // Chama o método correspondente à opção e imprime o resultado

        if (opcao == 1) {
            System.out.println("Resultado: " + somar(numA, numB));
        } else if (opcao == 2) {
            System.out.println("Resultado: " + subtrair(numA, numB));
        } else if (opcao == 3) {
            System.out.println("Resultado: " + multiplicar(numA, numB));
        } else if (opcao == 4) {
            System.out.println("Resultado: " + dividir(numA, numB));
        } else {
            System.out.println("Opção Inválida!");
        }
    }

    // Aqui vai retornar a operação escolhida dos dois números. (Tratando a divisão por zero)

    static double somar(double a, double b) {
        return a + b;
    }
    static double subtrair(double a, double b) {
        return a - b;
    }
    static double multiplicar(double a, double b) {
        return a * b;
    }
    static double dividir(double a, double b) {
        if (b == 0) {
        System.out.println("Erro: divisão por zero!");
        return 0;
    }
        return a / b;
    }
}