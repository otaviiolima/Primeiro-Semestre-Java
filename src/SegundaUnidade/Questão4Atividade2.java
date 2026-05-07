package SegundaUnidade;

import java.util.Scanner;

public class Questão4Atividade2 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;

        System.out.println("Digite o primeiro número:");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int num2 = scanner.nextInt();

        System.out.println("Digite o terceiro número:");
        int num3 = scanner.nextInt();

        int resultado = encontrarMaior(num1, num2, num3);
        System.out.println("O maior número entre os escolhidos é: "+ resultado);

        scanner.close();
    }

    static int encontrarMaior(int n1, int n2, int n3) {
        int maior = n1;
        if (n2 > maior) maior = n2;
        if (n3 > maior) maior = n3;
        return maior;

    }
}
