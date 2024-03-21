package Atividade2.view;

import Atividade2.controller.Ex05_C;

public class Ex05_V {
	public static void main(String[] args) {
		Ex05_C objt = new Ex05_C();
		
		int x = 20;
		int y = 24;
		
		int resultado = objt.calcularMDC(x, y);
		System.out.println("O MDC de " + x + " e " + y + " é: " + resultado);
	}
}
