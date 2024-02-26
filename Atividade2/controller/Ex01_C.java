package atividade2_2024_C;

/*
  1. Criar uma função recursiva que receba 2 valores A e B e,
  por somas, apresente o resultado da
  mul�plicação de A por B.
*/

public class Ex01_C {
	public Ex01_C () {
		super();
	}
	
	public int SomaVezes(int a, int b) {
		//condição
		if(a == 1) {
			return b;
		}
		
		return b + SomaVezes(a-1, b);
	}
}
