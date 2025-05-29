public class Animal {
  // Atributos
  String nome;
  String habitat;
  String som;
  String tipoDeAlimentacao;

// Construtor
public Animal(String nome, String habitat, String som, String tipoDeAlimentacao) {
    this.nome = nome;
    this.habitat = habitat;
    this.som = som;
    this.tipoDeAlimentacao = tipoDeAlimentacao;
}

// Método para mover
public void mover() {
    System.out.println(nome + " está no " + habitat);
}

// Método para emitir som
public void emitirSom() {
    System.out.println(nome + " faz " + som);
}

// Método para alimentar
public void alimentar() {
    if (tipoDeAlimentacao.equals("herbívoro")) {
        System.out.println(nome + " come plantas");
    } else if (tipoDeAlimentacao.equals("carnívoro")) {
        System.out.println(nome + " come carne");
    }
  }
}
