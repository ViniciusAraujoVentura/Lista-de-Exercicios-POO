public class Main {
    public static void main(String[] args) {
        Numero num = new Numero();

        num.valor = 42;

        num.imprimirValor();

        System.out.println("Endereço de memória (simulado): " + System.identityHashCode(num));
    }
}
