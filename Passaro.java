public class Passaro extends Animal {
    private boolean podeVoar;

    public Passaro(String nome, int idade, double peso, boolean podeVoar) {
        super(nome, idade, peso);
        this.podeVoar = podeVoar;
    }

    public void exibirDetalhes() {
        super.exibirDetalhes();
        if (podeVoar) {
            System.out.println("Pode voar: Sim");
        } else {
            System.out.println("Pode voar: Não");
        }
    }

    public String classificarAnimal() {
        return "Pássaro";
    }

    public String toString() {
        String textoVoar;

        if (podeVoar) {
            textoVoar = "Sim";
        } else {
            textoVoar = "Não";
        }

        return super.toString() + " | Pode voar: " + textoVoar;
    }

    public boolean getPodeVoar() {
        return podeVoar;
    }

    public void setPodeVoar(boolean podeVoar) {
        this.podeVoar = podeVoar;
    }
}