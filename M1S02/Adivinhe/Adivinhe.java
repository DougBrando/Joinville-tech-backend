package adivinhacao;

import java.util.Scanner;

public class Adivinhe {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Adivinhe qual número de 1 a 5 eu estou pensando: ");
        int selecti = entrada.nextInt();

        int randon = (int) (Math.random() * (10 - 5) + 5);

        if (selecti != randon){
            System.out.printf("Você errou, o número correto era %d",
                    randon);
        } else {
            System.out.println("Você acertou!");
        }

    }
}
