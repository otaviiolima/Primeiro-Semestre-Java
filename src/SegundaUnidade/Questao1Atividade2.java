package SegundaUnidade;

import java.util.Scanner;

public class Questao1Atividade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Que horas são:");
        int horas = scanner.nextInt();

        String resultado = periodo(horas);

        System.out.println(resultado + "" + nome);

        scanner.close();
    }

        static String periodo (int horas){
            if (horas >= 5 && horas <= 12) {
                return "Bom dia,";
            } else if (horas >= 13 && horas <= 18) {
                return "Boa tarde,";
            } else if (horas >= 19 || horas <= 4) {
                return "Boa noite,";
            } else {
                return "Hora inválida.";
            }
        }
    }