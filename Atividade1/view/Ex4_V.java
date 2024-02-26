package Atividade1.view;

import Atividade1.controller.Ex4_C;

public class Ex4_V {
	public static void main(String[] args) {
		Ex4_C objt = new Ex4_C();
		
		int[] vetor = {-1, 0, -8, 7, -3, 5};
        int totalNegativos = objt.contarNegativos(vetor, vetor.length - 1);
        System.out.println("O total de elementos negativos no vetor é: " + totalNegativos);
	}
}
