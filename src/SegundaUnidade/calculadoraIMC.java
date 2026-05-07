package SegundaUnidade;

import java.util.Scanner;

public class calculadoraIMC {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
        double pesoAltura = scanner.nextDouble();

        System.out.println("Digite sua altura:");
        double alturaPeso = scanner.nextDouble();

        double resultado = calcularIMC(pesoAltura, alturaPeso);
        System.out.printf("%.2f", resultado);

        scanner.close();

    }
    static Double calcularIMC(double peso, double altura){
        double IMC = peso / (altura * altura);
        return IMC;

    }
}
