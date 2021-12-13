package com.sandim;

import java.util.Scanner;

public class VisitaNaFeira {

    /*
    * Somar os pimentões recebidos na variável x
    * Entrada :
    *   A (Pimentões amarelos) B (pimentões vermelhos)
    * Saida :
    *   Imprimir a mensagem "X = " seguido pelo valor da variável X e pelo final de linha.
    *   Assegure que exista um espaço antes e depois do sinal de igualdade.
    * */

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int pimentoesAmarelos = leitor.nextInt();
        int pimentoesVermelhos = leitor.nextInt();
        int X = pimentoesAmarelos + pimentoesVermelhos;

        System.out.println("X = " + X);

    }

}
