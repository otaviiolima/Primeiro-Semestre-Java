package SegundaUnidade;

import java.util.Scanner;
public class atividade1 {

    public static void main(String[] args) {
        // Luiz Otávio Lima

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        String resultado = categoria(idade);

        System.out.println(resultado);

        scanner.close();
    }

    static String categoria(int idade) {

        if (idade <= 15) {
            return "Sem permissão para votar.";
        } else if (idade >= 16 && idade <= 17) {
            return "Voto facultativo.";
        } else if (idade >= 18 && idade <= 64) {
            return "Voto obrigatório!.";
        } else {
            return "Voto facultativo";
        }

    }
}
