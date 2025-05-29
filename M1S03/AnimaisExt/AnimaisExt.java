package exercicios;

import java.util.Scanner;

public class AnimaisExt {
    public static void main(String[] args){
        // Array com 5 especies
        String[] especiesAmeacadas = {
                "Panda",
                "Tigre de Bengala",
                "Rinoceronte Branco",
                "Baleia Azul",
                "Águia-careca"
        };

        //Scaner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um nome de especie para verificar se esta em perigo: ");
        String especieEntrada = entrada.nextLine();

        boolean encontrada = false;

        for (int i = 0; i < especiesAmeacadas.length; i++){
            if (especiesAmeacadas[i].equalsIgnoreCase(especieEntrada)){
                encontrada = true;
                break;
            }
        }
        if (encontrada){
            System.out.printf("A especie %s esta em perigo",
                    especieEntrada);
        } else {
            System.out.printf("A especie %s NÃO esta em perigo",
                    especieEntrada);
        }
    }
}
