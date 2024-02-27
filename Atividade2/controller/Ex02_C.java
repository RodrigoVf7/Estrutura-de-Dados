package atividade2_2024_C;

/*
  2. Criar uma função recursiva que receba
  o dividendo e o divisor de uma operação de divisão e, por
  subtrações, exiba o resto da divisão.
*/

public class Ex02_C {
	public Ex02_C() {
		super();
	}
	
	public int restoDiv(int dividendo, int divisor) {
		
		if(dividendo < divisor) {
			return dividendo;
		}
		int rest = dividendo - divisor;
		return restoDiv(rest, divisor);
		
	}
}
