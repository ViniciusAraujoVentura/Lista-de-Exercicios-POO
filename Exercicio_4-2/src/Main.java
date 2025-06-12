import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Contato> contatos = new ArrayList<>();

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Listar todos os contatos");
            System.out.println("3 - Procurar contato pelo nome");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            if (opcao == 1) {
                if (contatos.size() >= 10) {
                    System.out.println("Limite de 10 contatos atingido.");
                    continue;
                }

                System.out.print("Nome: ");
                String nome = sc.nextLine();

                System.out.print("Telefone: ");
                String telefone = sc.nextLine();

                System.out.print("Email: ");
                String email = sc.nextLine();

                Contato novoContato = new Contato(nome, telefone, email);
                contatos.add(novoContato);
                System.out.println("Contato adicionado com sucesso!");

            } else if (opcao == 2) {
                System.out.println("\n--- Lista de Contatos ---");
                if (contatos.isEmpty()) {
                    System.out.println("Nenhum contato cadastrado.");
                } else {
                    for (Contato c : contatos) {
                        c.exibirContato();
                    }
                }

            } else if (opcao == 3) {
                System.out.print("Digite o nome do contato que deseja buscar: ");
                String nomeBusca = sc.nextLine();
                boolean encontrado = false;

                for (Contato c : contatos) {
                    if (c.nome.equalsIgnoreCase(nomeBusca)) {
                        System.out.println("Telefone: " + c.telefone);
                        System.out.println("Email: " + c.email);
                        encontrado = true;
                        break;
                    }
                }

                if (!encontrado) {
                    System.out.println("Contato não encontrado.");
                }

            } else if (opcao == 0) {
                System.out.println("Encerrando o programa.");
                break;

            } else {
                System.out.println("Opção inválida.");
            }
        }

        sc.close();
    }
}
