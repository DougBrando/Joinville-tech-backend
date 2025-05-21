package exercicio;

import java.util.Scanner;

public class Media {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Digite a nota 1: ");
        double nota1 = entrada.nextDouble();

        System.out.printf("Digite a nota 2: ");
        double nota2 = entrada.nextDouble();

        System.out.printf("Digite a nota 3: ");
        double nota3 = entrada.nextDouble();

        double media = (nota1 + nota2 + nota3)/3;

        System.out.printf("Sua média final é: %.2f",
                media);

    }
}
