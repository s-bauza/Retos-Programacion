public class AnalisisDeTexto {

    private static String texto = "Hola. Me gustas. Mucho.";
    public static void main(String[] args) {

        analisisDeTexto(texto);

    }

    public static void analisisDeTexto(String texto) {
        auxAnalisisDeTexto(texto);
    }

    public static void auxAnalisisDeTexto(String texto) {
        int nTotalPalabras = 0, mediaPalabra = 0, nTotalOraciones = 0,
                contadorPalabra = 0, auxContadorPalabara = 0;

        for (int i = 0; i < texto.length(); i++) {

            if (texto.charAt(i) != ' ' && texto.charAt(i) != '.') {
                contadorPalabra++;
                mediaPalabra++;
            } else {
                if (texto.charAt(i - 1) != ' ' && texto.charAt(i - 1) != '.') {
                    nTotalPalabras++;
                }
                if (contadorPalabra > auxContadorPalabara) {
                    auxContadorPalabara = contadorPalabra;
                }
                contadorPalabra = 0;
                if (texto.charAt(i) == '.')
                    nTotalOraciones++;
            }

        }

        System.out.println("Number of words: " + (nTotalPalabras));
        System.out.printf("Character average: %.2f\n", (float) mediaPalabra / (float) (nTotalPalabras));
        System.out.println("Total sentences: " + nTotalOraciones);
        System.out.println("Longest word: " + auxContadorPalabara);

    }

}
