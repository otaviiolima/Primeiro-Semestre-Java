package SegundaUnidade;

import java.util.Scanner;

public class Questao1Vetores {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor1 = new int[4];
        int[] vetor2 = new int[4];
        int[] vetor3 = new int[4];

        System.out.println("Digite 4 números para primeiro vetor:");
        for (int i=0; i< vetor1.length; i++ ){
            vetor1[i] = scanner.nextInt();
        }
        System.out.println("Digite 4 números para o segundo vetor");
        for (int i=0; i< vetor2.length; i++) {
            vetor2[i] = scanner.nextInt();
        }
        for (int i=0; i< vetor3.length; i++){
            vetor3[i] = vetor1[i] + vetor2[i];
                System.out.print(vetor3[i] + " ");
        }

        scanner.close();
    }
}
