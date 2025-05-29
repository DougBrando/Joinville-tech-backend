package br.senai.futurodev.exercicos;

public class EmissaoDeCarbono {
    private String atividade;
    private double quantidadeEmissao;

    public EmissaoDeCarbono(String atividade, double quantidadeEmissao) {
        this.atividade = atividade;
        this.quantidadeEmissao = quantidadeEmissao;
    }
   public double EmissaoDeCarbono(double minutos){
        double horas = minutos / 60.0;
        double emissao = horas * quantidadeEmissao;
        return emissao;
   }


    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }

    public double getQuantidadeEmissao() {
        return quantidadeEmissao;
    }

    public void setQuantidadeEmissao(double quantidadeEmissao) {
        this.quantidadeEmissao = quantidadeEmissao;
    }
}
