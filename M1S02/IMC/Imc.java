package exercicio;

import java.util.Scanner;

public class Imc {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite sua altura: ");
        double altura = entrada.nextDouble();

        System.out.print("Digite sua peso: ");
        double peso = entrada.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f",
                imc);
    }
}
