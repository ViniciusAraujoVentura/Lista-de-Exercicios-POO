public class ValorContainer {
    int valor;

    // Método estático que troca os valores entre dois objetos
    public static void trocarValores(ValorContainer refA, ValorContainer refB) {
        int temp = refA.valor;
        refA.valor = refB.valor;
        refB.valor = temp;
    }
}
