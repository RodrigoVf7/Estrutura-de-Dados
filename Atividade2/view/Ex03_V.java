package Atividade2.view;

import Atividade2.controller.Ex03_C;

public class Ex03_V {
    public static void main(String[] args) {
        Ex03_C objt = new Ex03_C();

        int[] vet = {30, 17, 18, 25, 36, 1, 8};
        //passa a variavel vetor e o tamanho dele.
        int resultado = objt.calculaQuantidadeNumerosPares(vet, vet.length);
        System.out.println(resultado);
    }
}
