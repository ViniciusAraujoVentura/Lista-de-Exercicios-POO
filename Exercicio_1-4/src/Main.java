import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConversorTemperatura temperatura = new ConversorTemperatura();

        System.out.println("Conversor de Temperatura");
        System.out.println("Escolha a opção:");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");
        System.out.print("Opção: ");
        int opcao = sc.nextInt();

        if (opcao == 1) {
            System.out.print("Digite a temperatura em Celsius: ");
            double C = sc.nextDouble();
            double F = temperatura.CelsiusParaFahrenheit(C);
            System.out.printf("Resultado: %.2f °C = %.2f °F%n", C, F);
        } else if (opcao == 2) {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double F = sc.nextDouble();
            double C = temperatura.FahrenheitParaCelsius(F);
            System.out.printf("Resultado: %.2f °F = %.2f °C%n", F, C);
        } else {
            System.out.println("Opção inválida!");
        }

        sc.close();
    }
}
