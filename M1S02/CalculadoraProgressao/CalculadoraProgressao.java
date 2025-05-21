package exercicios;

import java.util.Scanner;

public class CalculadoraProgressao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Pede o valor inicial
        System.out.println("Digite o valor inicial (número inteiro): ");
        int valorInicial = entrada.nextInt();

        // Pede a raiz
        System.out.println("Digite o valor da raiz (razão): ");
        int raiz = entrada.nextInt();


        // Pergunta se é PA ou PG
        System.out.println("Digite 'PA' para Progressão Aritmética ou 'PG' para Progressão Geométrica: ");
        String escolha = entrada.nextLine().toUpperCase();

        // Variável para o termo atual
        int termo = valorInicial;

        // Se for P.A.
        if (escolha.equals("PA")) {
            System.out.println("Os 10 primeiros termos da Progressão Aritmética são:");
            for (int i = 0; i < 10; i++) {
                System.out.print(termo);
                if (i < 9) {
                    System.out.print(", "); // Vírgula entre os termos
                }
                termo = termo + raiz; // Soma a raiz
            }
            System.out.println(); // Quebra de linha no final
        }

        // Se for P.G.
        else if (escolha.equals("PG")) {
            System.out.println("Os 10 primeiros termos da Progressão Geométrica são:");
            for (int i = 0; i < 10; i++) {
                System.out.print(termo);
                if (i < 9) {
                    System.out.print(", "); // Vírgula entre os termos
                }
                termo = termo * raiz; // Multiplica pela raiz
            }
            System.out.println(); // Quebra de linha no final
        }

        // Caso a escolha seja inválida
        else {
            System.out.println("Opção inválida! Digite 'PA' ou 'PG'.");
        }

        }
}
