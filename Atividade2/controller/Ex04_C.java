package Atividade2.controller;

/*
 4. Faça uma função recursiva que receba um número inteiro posi�vo ímpar N e retorne o fatorial duplo 
desse número (A entrada deve ser validada fora da função recursiva). O fatorial duplo é definido como o 
produto de todos os números naturais ímpares de 1 até algum número natural ímpar N. Assim, o fatorial 
duplo de 5 é: 5!!= 1*3*5 = 15
 */

public class Ex04_C {
	public Ex04_C() {
		super();
	}
	
	//função recursiva que calcula o fatorial duplo
	public long calculaFatorialDuplo(int n) {
		if (n <= 1) {
			return 1;
		}
		
		return (long) n * calculaFatorialDuplo(n-2);
	}
	
}
