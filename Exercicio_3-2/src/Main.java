import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ValorContainer valorcont = new ValorContainer();

        // Criação dos objetos
        ValorContainer objA = new ValorContainer();
        ValorContainer objB = new ValorContainer();

        // Entrada de valores
        System.out.print("Digite o valor para objA: ");
        objA.valor = sc.nextInt();

        System.out.print("Digite o valor para objB: ");
        objB.valor = sc.nextInt();

        // Exibe os valores antes da troca
        System.out.println("\nAntes da troca:");
        System.out.println("objA.valor = " + objA.valor);
        System.out.println("objB.valor = " + objB.valor);

        // Chama o método que troca os valores
        valorcont.trocarValores(objA, objB);

        // Exibe os valores depois da troca
        System.out.println("\nDepois da troca:");
        System.out.println("objA.valor = " + objA.valor);
        System.out.println("objB.valor = " + objB.valor);

        sc.close();
    }
}
