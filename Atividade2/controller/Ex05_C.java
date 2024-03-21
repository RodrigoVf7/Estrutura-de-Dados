package Atividade2.controller;

/*
 5. O máximo divisor comum (MDC ou M.D.C) corresponde ao produto dos divisores comuns entre dois ou 
mais números inteiros. Para calcular o máximo divisor comum (MDC) entre números, devemos realizar a 
fatoração por meio da decomposição em fatores primos dos números indicados.
Para exemplificar, vamos calcular através da fatoração o MDC do 20 e 24:
Para saber o MDC dos números, devemos olhar à direita da fatoração e ver quais números dividiram, 
simultaneamente, nas duas colunas e mul�plicá-los.
Assim, pela fatoração podemos concluir que o 4 (2 x 2) é o maior número que divide ambos e, portanto, 
é o máximo divisor comum de 20 e 24
 */

public class Ex05_C {
	public Ex05_C() {
		super();
	}
	
	
	//função recursiva que calcula o mdc entre 2 numeros.
	
	public int calcularMDC(int x, int y) {
		   if (x > y) {
	            return calcularMDC(x - y, y);
	        } else if (y > x) {
	            return calcularMDC(x, y - x);
	        } else {
	            // Quando x é igual a y, encontramos o MDC
	            return x;
	        }
	}
}
