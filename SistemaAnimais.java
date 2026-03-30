import java.util.Scanner;

public class SistemaAnimais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GerenciadorAnimais gerenciador = new GerenciadorAnimais();

        String animalEscondido = "Dromedário";

        int opcao;

        do {
            System.out.println("\n=== SISTEMA DE ANIMAIS ===");
            System.out.println("1 -> Cadastrar");
            System.out.println("2 -> Listar");
            System.out.println("3 -> Buscar especie");
            System.out.println("4 -> Ordenar por nome");
            System.out.println("5 -> Remover");
            System.out.println("6 -> Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                System.out.println("\nQual animal deseja cadastrar?");
                System.out.println("1 -> Cachorro");
                System.out.println("2 -> Gato");
                System.out.println("3 -> Pássaro");
                System.out.print("Digite a opção: ");
                int tipo = sc.nextInt();
                sc.nextLine();

                System.out.print("Nome: ");
                String nome = sc.nextLine();

                System.out.print("Idade: ");
                int idade = sc.nextInt();

                System.out.print("Peso: ");
                double peso = sc.nextDouble();
                sc.nextLine();

                if (tipo == 1) {
                    System.out.print("Raça: ");
                    String raca = sc.nextLine();

                    Cachorro cachorro = new Cachorro(nome, idade, peso, raca);
                    gerenciador.adicionarAnimal(cachorro);
                    System.out.println("Cachorro cadastrado com sucesso.");

                } else if (tipo == 2) {
                    System.out.print("É independente? (true/false): ");
                    boolean independente = sc.nextBoolean();
                    sc.nextLine();

                    Gato gato = new Gato(nome, idade, peso, independente);
                    gerenciador.adicionarAnimal(gato);
                    System.out.println("Gato cadastrado com sucesso.");

                } else if (tipo == 3) {
                    System.out.print("Pode voar? (true/false): ");
                    boolean podeVoar = sc.nextBoolean();
                    sc.nextLine();

                    Passaro passaro = new Passaro(nome, idade, peso, podeVoar);
                    gerenciador.adicionarAnimal(passaro);
                    System.out.println("Pássaro cadastrado com sucesso.");

                } else {
                    System.out.println("Tipo inválido.");
                }

            } else if (opcao == 2) {
                gerenciador.listarAnimais();

            } else if (opcao == 3) {
                System.out.println("\nBuscar espécie:");
                System.out.println("1 -> Cachorro");
                System.out.println("2 -> Gato");
                System.out.println("3 -> Pássaro");
                System.out.print("Digite a opção: ");
                int busca = sc.nextInt();
                sc.nextLine();

                gerenciador.buscarPorEspecie(busca);

            } else if (opcao == 4) {
                gerenciador.ordenarPorNome();

            } else if (opcao == 5) {
                System.out.print("Digite o nome do animal que deseja remover: ");
                String nomeRemover = sc.nextLine();

                gerenciador.removerAnimal(nomeRemover);

            } else if (opcao == 6) {
                System.out.println("Encerrando o sistema...");
                System.out.println("Animal escondido: " + animalEscondido);

            } else {
                System.out.println("Opção inválida.");
            }

        } while (opcao != 6);

        sc.close();
    }
}