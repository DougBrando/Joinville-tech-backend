package M1S03.TemperaturaSemanal;

public class TemperaturaSemanal {
    public static void main(String[] args) {
        // Array com 7 temperaturas
        double[] temp = {25.5, 26.0, 24.8, 23.5, 25.0, 26.2, 24.0};

        double soma = temp[0] + temp[1] + temp[2] +
                temp[3] + temp[4] + temp[5] +
                temp[6];

        // Calculando a média (soma dividida por 7)
        double media = soma / temp.length;

        // Mostrando na tela
        System.out.println("Temperaturas: 25.5, 26.0, 24.8, 23.5, 25.0, 26.2, 24.0");
        System.out.println("Soma das temperaturas: " + soma);
        System.out.println("Media da semana: " + media);
    }
}
