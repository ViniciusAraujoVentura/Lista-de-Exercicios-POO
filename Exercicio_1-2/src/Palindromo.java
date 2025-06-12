public class Palindromo {
    // Método para verificar se uma string é palíndromo
    public static boolean Verificacao(String texto) {
        // Remove espaços e transforma em minúsculo
        String textoLimpo = texto.replaceAll("\\s+", "").toLowerCase();

        // Inverte a string
        String invertido = new StringBuilder(textoLimpo).reverse().toString();

        // Compara original com a invertida
        return textoLimpo.equals(invertido);
    }
}