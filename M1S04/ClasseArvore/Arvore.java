package br.senai.futurodev.exercicos;

public class Arvore {
    public String nome;
    public String tipo;
    public double altura;

    public Arvore(String nome, String tipo, double autura) {
        this.nome = nome;
        this.tipo = tipo;
        this.altura = autura;
    }

    public void exibirInformacoes() {
        System.out.println("Informações da Árvore:");
        System.out.println("Nome: " + this.nome);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Altura: " + this.altura + " metros");
    }
    // Método para calcular a produção de oxigênio
    public double calcularOxigenio() {
        // 1 metro = 10 gramas de oxigênio por dia
        return this.altura * 10;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularOxig(){

    }


}
