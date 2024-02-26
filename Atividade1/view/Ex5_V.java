package Atividade1.view;

import Atividade1.controller.Ex5_C;

public class Ex5_V {
	public static void main(String[] args) {
		Ex5_C objt = new Ex5_C();
		
		int n = 10;
		double resultado = objt.somatoriaRecursiva(n);
		System.out.println("A somatoria da sequência é:  " + resultado);
	}
}
