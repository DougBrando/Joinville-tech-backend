import java.util.ArrayList;
import java.util.Scanner;

public class TrilhaEcologica {
    public static void main(String[] args) {
        // Lista para guardar as paradas
        ArrayList<String> paradas = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== Trilha Ecológica ===");

        // Loop para adicionar paradas
        while (true) {
            System.out.print("Quer adicionar uma parada? (sim/nao): ");
            String resposta = entrada.nextLine();

            // Se for "nao", para o loop
            if (resposta.equals("nao")) {
                break;
            }

            // Pede o nome da parada
            System.out.print("Nome da parada: ");
            String nome = entrada.nextLine();

            // Mostra as paradas atuais, se tiver
            if (paradas.size() > 0) {
                System.out.println("Paradas atuais:");
                int numero = 1; // Para numerar as paradas
                for (String parada : paradas) {
                    System.out.println(numero + ". " + parada);
                    numero++;
                }
            }

            // Pede a posição
            System.out.print("Qual posição (1 a " + (paradas.size() + 1) + ")? ");
            int posicao = entrada.nextInt();
            entrada.nextLine(); // Limpa o enter

            // Adiciona na posição (subtrai 1 porque o ArrayList começa em 0)
            paradas.add(posicao - 1, nome);
            System.out.println("Adicionou " + nome + " na posição " + posicao + "!");
        }

        // Mostra o itinerário
        System.out.println("\n=== Itinerário ===");
        if (paradas.size() == 0) {
            System.out.println("Nenhuma parada na trilha.");
        } else {
            int numero = 1; // Para numerar as paradas
            for (String parada : paradas) {
                System.out.println(numero + ". " + parada);
                numero++;
            }
        }

        entrada.close();
    }
}
