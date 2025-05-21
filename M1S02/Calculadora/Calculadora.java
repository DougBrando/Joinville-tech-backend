package exercicio;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("digite um numero: ");
        int n1 = entrada.nextInt();

        System.out.println("digite um segundo numero");
        int n2 = entrada.nextInt();

        entrada.nextLine();

        System.out.println("agora escolha uma opção:  ex: “somar”, “subtrair”, “multiplicar” ou \"dividir\"");
        String operacao = entrada.nextLine();

        int result = 0;

        if (operacao.equals("somar")){
            result = n1+n2;
        } else if (operacao.equals("subtrair")) {
            result = n1-n2;
        } else if (operacao.equals("multiplicar")){
            result = n1*n2;
        } else if (operacao.equals("dividir")){
            result = n1/n2;
        }
        System.out.println("resultado: " + result);
    };
}
