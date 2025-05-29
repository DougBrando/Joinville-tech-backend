package exercicios;

import java.util.Scanner;

public class QualidadeAr {
    public static void main(String[] args){
        //Declaração de Arrays
        String[] cidades = new String[5];
        int[] indices = new int[5];

        // Scanner para entrada de valores
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome de 5 cidade e seus indices de qualidade de ar");
        for (int i = 0; i< 5; i++){
            System.out.printf("Nome da cidade %d: %n",
                    i + 1);
            cidades[i] = entrada.nextLine();
            System.out.printf("indicide da qualidade do ar de %s: %n",
                    cidades[i]);
            indices[i] = entrada.nextInt();
            entrada.nextLine(); // Limpa o buffer após nextInt()
        }
        // limite seguro
        int limiteSeg = 100;

        // verificador de limite
        boolean acimaDoLim = false;
        boolean abaixoDoLim = false;

        System.out.println("\nCidades com indice de qualidade do ar acima do limite seguro (100):");
        for (int i = 0; i < indices.length; i++) {
            if (indices[i] > 100) {
                System.out.printf("%s: %d%n",
                        cidades[i], indices[i]);
                acimaDoLim = true;
            }
        }
        System.out.println("\nCidades com indice que estão dentro do limite. (100):");
        for (int i = 0; i < indices.length; i++) {
            if (indices[i] <= 100) {
                System.out.printf("%s: %d%n",
                        cidades[i], indices[i]);
                acimaDoLim = true;
            }
        }
        if(!acimaDoLim){
            System.out.println("nenhuma cidade esta acima do seguro.");
        }
    }
}
