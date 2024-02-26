package Atividade1.controller;

/*
   4. Crie uma função recursiva que exiba o total de elementos nega�vos
    de um vetor de inteiros, de N
   posições, passado como parâmetro:
   O código deve trazer como comentários:
   A condição de parada
   Como escrever a função para o termo n em função do termo anterior
 */

public class Ex4_C {
	public Ex4_C() {
		super();
	}
	
	public int contarNegativos(int[] vetor, int n) {
        // Condição de parada
        if (n < 0) {
            return 0;
        }

        // Função para o termo n em função do termo anterior
        int totalAnterior = contarNegativos(vetor, n - 1);

        // Verifica se o elemento atual é negativo e incrementa o total
        return vetor[n] < 0 ? 1 + totalAnterior : totalAnterior;
    }
	
}
