import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Cadastrar funcionário");
            System.out.println("2 - Calcular total de salários por departamento");
            System.out.println("3 - Listar todos os funcionários");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine(); // Limpa buffer

            if (opcao == 1) {
                System.out.print("Nome: ");
                String nome = sc.nextLine();

                System.out.print("ID: ");
                int id = sc.nextInt();

                System.out.print("Salário: ");
                double salario = sc.nextDouble();
                sc.nextLine(); // Limpa buffer

                System.out.print("Departamento: ");
                String departamento = sc.nextLine();

                Funcionario f = new Funcionario(nome, id, salario, departamento);
                funcionarios.add(f);
                System.out.println("Funcionário cadastrado com sucesso!");

            } else if (opcao == 2) {
                System.out.print("Informe o nome do departamento: ");
                String dep = sc.nextLine();

                double totalSalarios = 0;
                for (Funcionario f : funcionarios) {
                    if (f.departamento.equalsIgnoreCase(dep)) {
                        totalSalarios += f.salario;
                    }
                }

                System.out.printf("Total de salários do departamento '%s': R$ %.2f%n", dep, totalSalarios);

            } else if (opcao == 3) {
                System.out.println("\n--- Funcionários Cadastrados ---");
                for (Funcionario f : funcionarios) {
                    f.exibirDados();
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
