import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o número de linhas (m): ");
        int m = sc.nextInt();

        System.out.print("Informe o número de colunas (n): ");
        int n = sc.nextInt();

        int[][] matriz = new int[m][n];

        System.out.println("Digite os elementos da matriz (" + m + "x" + n + "):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        
        int maior = matriz[0][0];
        int menor = matriz[0][0];

        // Percorre a matriz para encontrar maior e menor
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }

        System.out.println("Maior elemento da matriz: " + maior);
        System.out.println("Menor elemento da matriz: " + menor);

        sc.close();
    }
}
