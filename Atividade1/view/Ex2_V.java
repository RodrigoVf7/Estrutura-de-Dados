package Atividade1.view;

import Atividade1.controller.Ex2_C;

public class Ex2_V {
	public static void main(String[] args) {
		Ex2_C objt = new Ex2_C();
		
        int[] vetor = {5, 8, 2, 10, 3};
        int tamanho = vetor.length;

        // Chamada para encontrar o menor valor
        int menorValor = objt.encontrarMenorValor(vetor, tamanho - 1);
        System.out.println("O menor valor no vetor é: " + menorValor);
    }
}
