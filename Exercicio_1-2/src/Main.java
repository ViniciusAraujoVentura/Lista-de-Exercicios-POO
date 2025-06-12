import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Palindromo Palin = new Palindromo();

        System.out.print("Digite uma palavra ou frase para verificar se é um palíndromo: ");
        String entrada = sc.nextLine();

        if (Palin.Verificacao(entrada)) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo.");
        }

        sc.close();
    }
}
