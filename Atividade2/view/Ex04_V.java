package Atividade2.view;
import java.util.Scanner;

import Atividade2.controller.Ex04_C;

public class Ex04_V {
	public static void main(String[] args) {
		Scanner digite = new Scanner(System.in);
		Ex04_C objt = new Ex04_C();
		
		while (true) {
            System.out.println("Digite um número natural ímpar (ou digite 0 para encerrar): ");
            int n = digite.nextInt();

            if (n == 0) {
                System.out.println("Programa encerrado.");
                break;  // Sai do loop se o usuário digitar 0
            }

            if (n <= 0 || n % 2 == 0) {
                System.out.println("Número inválido. Por favor, digite um número natural ímpar.");
            } else {
                long resultado = objt.calculaFatorialDuplo(n);
                System.out.println("O fatorial duplo de " + n + "! é: " + resultado);
            }
        }
        
        digite.close();  // Fecha o scanner quando o loop é encerrado
    
	}
}
