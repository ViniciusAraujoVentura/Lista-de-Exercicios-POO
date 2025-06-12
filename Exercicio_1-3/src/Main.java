import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fatorial fato = new Fatorial();

        System.out.print("Digite um número inteiro não negativo: ");
        int numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("Número inválido! Por favor, insira um número não negativo.");
        } else {
            long resultado = fato.CalcularFatorial(numero);
            System.out.println("Fatorial de " + numero + " é: " + resultado);
        }

        sc.close();
    }
}
