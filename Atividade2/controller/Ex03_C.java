package Atividade2.controller;

/*
  3. Construir uma função recursiva que receba um vetor e seu tamanho e apresente a quantidade de 
     números pares existentes no vetor. Considere que a entrada deve ser apenas de números naturais 
     diferentes de zero.
 */

public class Ex03_C {
    public Ex03_C() {
        super();
    }

    // Função recursiva que conta a quantidade de números pares no vetor
    public int calculaQuantidadeNumerosPares(int[] vet, int tamanho) {
        // Caso base: quando o tamanho do vetor é 0, não há mais elementos para verificar
        if (tamanho == 0) {
            return 0;
        }

        // Verifica se o último elemento do vetor é par
        int ultimoElemento = vet[tamanho - 1];
        int paresRestantes = calculaQuantidadeNumerosPares(vet, tamanho - 1);

        // Se o último elemento for par, incrementa a contagem de pares
        if (ultimoElemento % 2 == 0) {
        	//vai incrementar na pilha + 1 e quando o vetor for de tamaho 0, essa pilha vai voltar como uma soma: 1+1+1... até a primeira iteração
            return paresRestantes + 1;
        } else {
        	// só retorna a função com o vetor menor para continuar a leitura
            return paresRestantes;
        }
    }
}

