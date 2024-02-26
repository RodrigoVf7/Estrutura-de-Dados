package Atividade1.controller;

/*
	 5. Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um número 
	inteiro (N), apresente a saída da somatória 
	𝑆𝑆 = 1 +
	1
	2 +
	1
	3 +
	1
	4 + … +
	1
	𝑁𝑁
	• O Código deve apresentar, em formato de comentário, como foi definida a condição 
	de parada;
	• O Código deve apresentar, em formato de comentário, como foi definida a relação de 
	chamada dos passos;
	Dica: Para fazer a divisão de 2 inteiros retornar um double, deve-se converter (cast) as variáveis para 
	double. 
	Exemplo: 
	 int n = 2;
	 double x = 1 / (double) n 
*/

//Função recursiva para calcular a somatória
public class Ex5_C {
	public Ex5_C() {
		super();
	}
	
	public double somatoriaRecursiva(int n) {
		
		// Condição de parada: quando N atinge 0, retorna 0 para encerrar a recursão
        if (n == 0) {
            return 0;
        }

        // Relação de chamada dos passos: chamada recursiva com N-1 e adição do termo atual
        double termoAtual = 1.0 / n;
        return termoAtual + somatoriaRecursiva(n - 1);
	}
	
}
