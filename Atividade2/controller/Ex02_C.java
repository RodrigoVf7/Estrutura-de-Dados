package atividade2_2024_C;

/*
  2. Criar uma fun��o recursiva que receba
  o dividendo e o divisor de uma opera��o de divis�o e, por
  subtra��es, exiba o resto da divis�o.
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
