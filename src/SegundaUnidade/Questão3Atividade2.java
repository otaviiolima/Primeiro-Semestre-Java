package SegundaUnidade;

import java.util.Scanner;

public class Questão3Atividade2 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        double tempC = scanner.nextDouble();

        double resultado = celsiusParaFahrenheit(tempC);
        System.out.println(resultado);

        scanner.close();
    }

    static double celsiusParaFahrenheit(double tempC){
        double F = (tempC * 1.8) + 32;
        return F;
    }
}
