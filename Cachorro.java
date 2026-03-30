public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, int idade, double peso, String raca) {
        super(nome, idade, peso);
        this.raca = raca;
    }

    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Raça: " + raca);
        System.out.println("Som: Latido");
    }

    public String classificarAnimal() {
        return "Cachorro";
    }

    public String toString() {
        return super.toString() + " | Raça: " + raca + " | Som: Latido";
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}