import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.print("Digite o primeiro valor: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double num2 = sc.nextDouble();

        System.out.println("CALCULADORA");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Escolha a operação: ");
        int opcao = sc.nextInt();

        double resultado;

        if (opcao == 1){
            resultado = calc.somar(num1, num2);
            System.out.println("Resultado: " + resultado);
        } else if (opcao == 2){
            resultado = calc.subtrair(num1, num2);
            System.out.println("Resultado: " + resultado);
        }  else if (opcao == 3){
            resultado = calc.multiplicar(num1, num2);
            System.out.println("Resultado: " + resultado);
        }  else if (opcao == 4){
            resultado = calc.dividir(num1, num2);
            System.out.println("Resultado: " + resultado);
        } else {
            System.out.println("Opção Inválida!");
        }
        sc.close();
    }
}