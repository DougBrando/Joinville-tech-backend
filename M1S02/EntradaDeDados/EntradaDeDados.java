package M1S02;

import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine().trim();

        System.out.println("Digite seu Sobrenome: ");
        String sobre = entrada.nextLine().trim();

        String completo = nome + sobre;

        int numeroDeLetras = completo.length();


        System.out.printf("Seu nome é %s %s e seu nome tem %d letras",
                nome, sobre, numeroDeLetras);
    }
}
