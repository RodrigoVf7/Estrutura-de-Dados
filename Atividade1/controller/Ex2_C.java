package Atividade1.controller;

/*
	 Criar uma aplicação em Java que tenha uma função recursiva que,
	 recebendo um vetor de inteiros, o
	 tamanho do vetor e o valor da última posição do vetor como o primeiro menor valor,
	 retorne o menor
	 valor contido neste vetor.
	 O Código deve apresentar, em formato de comentário,
	 como foi definida a condição de parada;
	 O Código deve apresentar, em formato de comentário,
	 como foi definida a relação de chamada dos passos;
*/

public class Ex2_C {
	public Ex2_C() {
		super();
	}
	

    //Função recursiva para encontrar o menor valor em um vetor.
	public int encontrarMenorValor(int[] vetor, int pos) {
       // A condição de parada é quando a posição atual (pos) é igual a zero.
       if (pos == 0) {
           return vetor[0];
       }

       // A relação de chamada dos passos é a chamada recursiva com a posição anterior (pos - 1)
       // se o valor na posição atual (vetor[pos]) for menor que o valor na posição anterior (vetor[pos - 1]).
       int menorValorAnterior = encontrarMenorValor(vetor, pos - 1);

       // Comparação entre a posição atual e a posição anterior
       if (vetor[pos] < menorValorAnterior) {
           return vetor[pos];
       } else {
           return menorValorAnterior;
       }
    }
	
}
