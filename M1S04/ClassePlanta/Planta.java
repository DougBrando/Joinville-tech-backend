package modules;

public class Planta {
    private String nome;
    private String tipo;
    private double nescessidadeDeAgua;
    private double areaCultivo;

    public Planta(String nome, String tipo, double nescessidadeDeAgua, double areaCultivo) {
        this.nome = nome;
        this.tipo = tipo;
        this.nescessidadeDeAgua = nescessidadeDeAgua;
        this.areaCultivo = areaCultivo;
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

    public double getNescessidadeDeAgua() {
        return nescessidadeDeAgua;
    }

    public void setNescessidadeDeAgua(double nescessidadeDeAgua) {
        this.nescessidadeDeAgua = nescessidadeDeAgua;
    }

    public double getAreaCultivo() {
        return areaCultivo;
    }

    public void setAreaCultivo(double areaCultivo) {
        this.areaCultivo = areaCultivo;
    }

    public double calcularNecessidadeDeAgua(int qtdSemanais){
        double totalAgua = nescessidadeDeAgua + areaCultivo + qtdSemanais;
        System.out.printf("A planta %s precisa de %.2f litros de água para %d semanas%n",
                nome, totalAgua, qtdSemanais);
        return totalAgua;
    }

    public void irrigar(){
        System.out.printf("A planta %s foi irrigada com sucesso!%n",
                nome);
    }

}
