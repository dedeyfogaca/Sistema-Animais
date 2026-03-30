import java.util.ArrayList;

public class GerenciadorAnimais {
    private ArrayList<Animal> listaAnimais;

    public GerenciadorAnimais() {
        listaAnimais = new ArrayList<Animal>();
    }

    public void adicionarAnimal(Animal animal) {
        listaAnimais.add(animal);
    }

    public void listarAnimais() {
        if (listaAnimais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado.");
        } else {
            for (Animal animal : listaAnimais) {
                System.out.println(animal);
            }
        }
    }

    public void buscarPorEspecie(int tipo) {
        boolean encontrou = false;

        for (Animal animal : listaAnimais) {
            if (tipo == 1 && animal instanceof Cachorro) {
                System.out.println(animal);
                encontrou = true;
            } else if (tipo == 2 && animal instanceof Gato) {
                System.out.println(animal);
                encontrou = true;
            } else if (tipo == 3 && animal instanceof Passaro) {
                System.out.println(animal);
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhum animal dessa espécie foi encontrado.");
        }
    }

    public void ordenarPorNome() {
        if (listaAnimais.isEmpty()) {
            System.out.println("Nenhum animal para ordenar.");
            return;
        }

        for (int i = 0; i < listaAnimais.size() - 1; i++) {
            for (int j = 0; j < listaAnimais.size() - 1 - i; j++) {
                String nome1 = listaAnimais.get(j).getNome();
                String nome2 = listaAnimais.get(j + 1).getNome();

                if (nome1.compareToIgnoreCase(nome2) > 0) {
                    Animal temp = listaAnimais.get(j);
                    listaAnimais.set(j, listaAnimais.get(j + 1));
                    listaAnimais.set(j + 1, temp);
                }
            }
        }

        System.out.println("Animais ordenados por nome com sucesso.");
    }

    public void removerAnimal(String nome) {
        boolean removido = false;

        for (int i = 0; i < listaAnimais.size(); i++) {
            if (listaAnimais.get(i).getNome().equalsIgnoreCase(nome)) {
                listaAnimais.remove(i);
                removido = true;
                System.out.println("Animal removido com sucesso.");
                break;
            }
        }

        if (!removido) {
            System.out.println("Animal não encontrado.");
        }
    }
}