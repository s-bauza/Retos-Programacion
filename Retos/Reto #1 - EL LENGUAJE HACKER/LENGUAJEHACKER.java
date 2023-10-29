public class LENGUAJEHACKER {
    public static void main(String[] args) {

        lanzaderaLenguajeHacker();

    }

    static void lanzaderaLenguajeHacker() {
        String texo = "En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivia un hidalgo de los de lanza en astillero, adarga antigua, rocin flaco y galgo corredor";
        System.out.println(auxLenguajeHAcker(texo));

    }

    static String auxLenguajeHAcker(String texto) {
        String[] leet = { "4", "I3", "[", ")", "3", "|=", "&", "#", "1", ",_|", ">|", "1", "/\\/\\", "^/", "0", "|*",
                "(_,)", "I2", "5", "7", "(_)", "\\/", "/\\/\\/", "><", "j", "2" };
        char[] abecedario = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        String auxTexto = "";
        boolean letra;

        for (int i = 0; i < texto.length(); i++) {
            letra = false;
            for (int j = 0; j < abecedario.length; j++) {
                if (texto.toLowerCase().charAt(i) == abecedario[j]) {
                    auxTexto += leet[j];
                    letra = true;
                }
            }
            if (!letra) {
                auxTexto += texto.charAt(i);
            }
        }
        return auxTexto;
    }
}