public class Fatorial {
    // Método recursivo para calcular o fatorial
    public static long CalcularFatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * CalcularFatorial(n - 1);
        }
    }
}