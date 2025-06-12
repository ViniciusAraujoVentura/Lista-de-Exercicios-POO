import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a ordem da matriz quadrada (n): ");
        int n = scanner.nextInt();

        int[][] matriz = new int[n][n];

        System.out.println("Digite os elementos da matriz (" + n + "x" + n + "):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        int somaPrincipal = 0;
        int somaSecundaria = 0;

        for (int i = 0; i < n; i++) {
            somaPrincipal += matriz[i][i]; // Diagonal principal: linha = coluna
            somaSecundaria += matriz[i][n - 1 - i]; // Diagonal secundária: coluna decrescente
        }

        System.out.println("Soma da diagonal principal: " + somaPrincipal);
        System.out.println("Soma da diagonal secundária: " + somaSecundaria);

        scanner.close();
    }
}
