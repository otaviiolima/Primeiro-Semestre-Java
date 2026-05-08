package SegundaUnidade;

import java.util.Scanner;

public class ParOuImpar {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num = scanner.nextInt();

        boolean resultado = ePar(num);

        System.out.println(resultado);

        scanner.close();
    }

    static boolean ePar(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}