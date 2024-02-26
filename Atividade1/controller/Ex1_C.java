package Atividade1.controller;

/* 
	 1. Criar uma aplicação em Java que tenha uma função
	  recursiva que calcule o somatório do N primeiros
	  número NATURAIS (a função deve retornar zero para números nega�vos)
	  O Código deve apresentar, em formato de comentário,
	  como foi definida a condição de parada;
	  O Código deve apresentar, em formato de comentário,
	  como foi definida a relação de chamada dos passos;
 */

public class Ex1_C {
	public Ex1_C() {
		super();
	}

	
	//Função recursiva para calcular o somatório dos N primeiros números naturais.
	public int calcularSomatorio(int n) {
        // Condição de parada
        if (n <= 0) {
            return 0;
        }
        // Relação de chamada dos passos n-1
        return n + calcularSomatorio(n - 1);
    }
}
