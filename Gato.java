public class Gato extends Animal {
    private boolean independente;

    public Gato(String nome, int idade, double peso, boolean independente) {
        super(nome, idade, peso);
        this.independente = independente;
    }

    public void exibirDetalhes() {
        super.exibirDetalhes();
        if (independente) {
            System.out.println("Independente: Sim");
        } else {
            System.out.println("Independente: Não");
        }
    }

    public String classificarAnimal() {
        return "Gato";
    }

    public String toString() {
        String textoIndependente;

        if (independente) {
            textoIndependente = "Sim";
        } else {
            textoIndependente = "Não";
        }

        return super.toString() + " | Independente: " + textoIndependente;
    }

    public boolean getIndependente() {
        return independente;
    }

    public void setIndependente(boolean independente) {
        this.independente = independente;
    }
}