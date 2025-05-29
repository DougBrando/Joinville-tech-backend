package modules;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class PerfilDeSaude {
    private String nome;
    private String sobrenome;
    private String sexo;
    private int diaNasc;
    private int mesNasc;
    private int anoNasc;
    private double altura;
    private double peso;

    public PerfilDeSaude(String nome, String sobrenome, String sexo, int diaNasc, int mesNasc, int anoNasc, double altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.diaNasc = diaNasc;
        this.mesNasc = mesNasc;
        this.anoNasc = anoNasc;
        this.altura = altura;
        this.peso = peso;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getDiaNasc() {
        return diaNasc;
    }

    public void setDiaNasc(int diaNasc) {
        this.diaNasc = diaNasc;
    }

    public int getMesNasc() {
        return mesNasc;
    }

    public void setMesNasc(int mesNasc) {
        this.mesNasc = mesNasc;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    Calendar cal = GregorianCalendar.getInstance();

    public int calculaIdade(){
        int idade = cal.get(Calendar.YEAR) - anoNasc;
        return idade;
    }
    // Método para calcular a frequência cardíaca máxima
    public int calcularFrequenciaMaxima() {
        return 220 - calculaIdade();
    }

    // Método para calcular a frequência cardíaca alvo (50-85%)
    public String calcularFrequenciaAlvo() {
        int freqMaxima = calcularFrequenciaMaxima();
        double limiteInferior = freqMaxima * 0.50;
        double limiteSuperior = freqMaxima * 0.85;
        return String.format("%.0f - %.0f", limiteInferior, limiteSuperior);
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

}
