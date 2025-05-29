package modules;

import java.time.LocalDate;
import java.time.Period;

public class FrequenciaCardiaca {
    private String nome;
    private String sobrenome;
    private LocalDate datanasc;

    public FrequenciaCardiaca(String nome, String sobrenome, int dia, int mes, int ano) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.datanasc = LocalDate.of(ano, mes, dia);
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

    public LocalDate getDatanasc() {
        return datanasc;
    }

    public void setDataNasc(int dia, int mes, int ano) {
        this.datanasc = LocalDate.of(ano, mes, dia);
    }

    // calcular idade
    public int calcularIdade() {
        return Period.between(datanasc, LocalDate.now()).getYears();
    }

    public int calcularFrequenciaMaxima(){
        return 220 - calcularIdade();
    }

    public String calcularFrenquenciaAlvo(){
        int frequenMax = calcularFrequenciaMaxima();
        double limiteInferior = frequenMax * 0.50;
        double limiteSuper = frequenMax * 0.85;
        return String.format("%.0f - %.0f",
                limiteInferior, limiteSuper);
    }

}
