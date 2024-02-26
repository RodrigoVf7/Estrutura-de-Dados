package Atividade1.view;

import Atividade1.controller.Ex3_C;

public class Ex3_V {
	public static void main(String[] args) {
		Ex3_C objt = new Ex3_C();
		int numero = 12;
		int resultado = objt.calcularFatorial(numero, 1);
		System.out.println("O fatorial de " + numero + " é " + resultado);
	}
}
