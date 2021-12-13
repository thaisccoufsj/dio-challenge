package com.sandim.estruturaDeDados;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        Queue<Carro> queueCarros = new LinkedList<>();
        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));

        //Dá erro caso não consiga adicionar
        System.out.println(queueCarros.add(new Carro("Peugeot")));
        System.out.println(queueCarros);

        //Adiciona e retorna falso caso erro
        System.out.println(queueCarros.offer(new Carro("Renault")));
        System.out.println(queueCarros);

        //Retorna primeiro elemento (cabeça)
        System.out.println(queueCarros.peek());
        System.out.println(queueCarros);

        //Retorna e remove primeiro elemento (cabeça)
        System.out.println(queueCarros.poll());
        System.out.println(queueCarros);

        System.out.println(queueCarros.isEmpty());

        System.out.println(queueCarros.size());

    }

}
