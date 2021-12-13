package com.sandim;

import java.util.HashMap;
import java.util.Scanner;

public class DDD {

    /*
    * Ler DDD para discagem interubana
    * Informar cidade de acordo com a tabela :
    * DDD   - Cidade
    * 61    - Brasilia
    * 71    - Salvador
    * 11    - Sao Paulo
    * 21    - Rio de Janeiro
    * 32    - Juiz de Fora
    * 19    - Campinas
    * 27    - Vitoria
    * 31    - Belo Horizonte
    * ??    - DDD nao cadastrado
    * */

    public static void main(String[] args) {

        HashMap<Integer,String> DDDCidades = new HashMap<Integer, String>();
        DDDCidades.put(61, "Brasilia");
        DDDCidades.put(71, "Salvador");
        DDDCidades.put(11, "Sao Paulo");
        DDDCidades.put(21, "Rio de Janeiro");
        DDDCidades.put(32, "Juiz de Fora");
        DDDCidades.put(19, "Campinas");
        DDDCidades.put(27, "Vitoria");
        DDDCidades.put(31, "Belo Horizonte");

        Scanner sc = new Scanner(System.in);
        int ddd = sc.nextInt();

        System.out.println(DDDCidades.getOrDefault(ddd, "DDD nao cadastrado"));
    }

}
