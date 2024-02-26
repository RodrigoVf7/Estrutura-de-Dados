package Atividade1.view;

import java.util.Scanner;

import Atividade1.controller.Ex1_C;

public class Ex1_V {
	public static void main(String[] args) {
		//instanciando a classe Ex_C e criando um objeto
		Ex1_C objt = new Ex1_C();
		
		Scanner escreve = new Scanner(System.in);
		System.out.println("Digiite um número para calcular dos N primeiros números:");
		//n O número de termos para calcular o somatório.
		int n = escreve.nextInt();
		
		//O somatório dos primeiros N números naturais.
		int resultado = objt.calcularSomatorio(n);
		System.out.println("A soma dos " + n + " termos é: " + resultado);
		escreve.close();
	}
}
