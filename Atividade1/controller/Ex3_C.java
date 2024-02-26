package Atividade1.controller;

/*
Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um vetor de inteiros, o
tamanho do vetor e o valor da úl�ma posição do vetor como o primeiro menor valor, retorne o menor
valor con�do neste vetor.
O Código deve apresentar, em formato de comentário, como foi definida a condição de parada;
O Código deve apresentar, em formato de comentário, como foi definida a relação de chamada dos passos;
*/

public class Ex3_C {
	public Ex3_C() {
		super();
	}
	
	public int calcularFatorial(int n, int parcial) {
        if (n < 0) {
            throw new IllegalArgumentException("O fatorial não está definido para números negativos");
        }
        // parcial começa com 1
        // Condição de parada
        if (n == 0 || n == 1) {
            return parcial;
        }

        
        /*
          	Atualiza o parcial multiplicando pelo número atual.
         
         	(n * parcial) é passado como o novo valor de parcial.
          	Isso significa que o resultado parcial acumulado até agora é multiplicado
           	pelo valor atual de n.
           	Este é o aspecto chave da otimização de [[recursão de cauda]], onde o resultado
          	acumulado é passado como um parâmetro para a próxima chamada,
           	eliminando a necessidade de acumulação na pilha de chamadas.
         */
        return calcularFatorial(n - 1, n * parcial);
    }
}
