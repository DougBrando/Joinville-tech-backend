package br.senai.futurodev.exercicos;

import java.util.ArrayList;
import java.util.Scanner;

public class Luz {
    public static void main(String[] args) {
        ArrayList<Double> consumoMensal = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);

        double limite = 200.0;

        consumoMensal.add(180.5);  // Janeiro
        consumoMensal.add(210.0);  // Fevereiro
        consumoMensal.add(195.3);  // Março
        consumoMensal.add(230.7);  // Abril
        consumoMensal.add(175.2);  // Maio
        consumoMensal.add(220.1);  // Junho

        double soma =0;
        for (double consumo: consumoMensal){
            soma =+ consumo;
        }

        double media = soma / consumoMensal.size();
        System.out.printf("Consumo medio: %.2fkWh%n", media);
        System.out.printf("Limite sustentavel: %.2fkWh%n", limite);

        if (media > limite) {
            System.out.println("A casa está consumindo mais energia do que deveria!");
        } else {
            System.out.println("A casa está dentro do limite sustentável!");
        }


    }
}
