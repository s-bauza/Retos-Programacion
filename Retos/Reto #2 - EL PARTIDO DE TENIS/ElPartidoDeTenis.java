public class ElPartidoDeTenis {
    public static void main(String[] args) {

        // P1 es A
        // P2 es B
        // Secuencia [A, A, B, B, A, B, A, A]
        char[] secuencia = { 'A', 'A', 'B', 'B', 'A', 'B', 'A', 'B', 'B', 'B' };
        comentarPartido(secuencia);
        
    }

    static void comentarPartido(char[] secuencia) {

        String[] puntuaciones = { "Love", "15", "30", "40", "Deuce", "Ventaja" };

        if (auxComentarPartido(puntuaciones, secuencia)) {
            System.out.println("Tenemos ganador "+ secuencia[secuencia.length-1]);
        } else
            System.out.println("Secuencia incorrecta");

    }

    static boolean auxComentarPartido(String[] puntuaciones, char[] secuencia) {

        String A = "Love", B = "Love";

        for (int i = 0; i < secuencia.length; i++) {
            if (((secuencia[i] == 'A' && A == "Ventaja") || (secuencia[i] == 'A' && A == "40")
                    || (secuencia[i] == 'B' && B == "Ventaja") || (secuencia[i] == 'B' && B == "40")) && (A != B)) {
                if (i != secuencia.length - 1) {
                    return false;
                } else
                    return true;
            }
            else if (secuencia[i] == 'A') {
                for (int j = 0; j < puntuaciones.length; j++) {
                    if (A == puntuaciones[j]) {
                        A = puntuaciones[j + 1];
                        if ((A == "40" && B == "40")||(A=="Ventaja"&&B=="Ventaja")) {
                            A = "Deuce";
                            B = "Deuce";
                        }
                        break;
                    }
                }
            } else {
                for (int k = 0; k < puntuaciones.length; k++) {
                    if (B == puntuaciones[k]) {
                        B = puntuaciones[k + 1];
                        if ((A == "40" && B == "40")||(B=="Ventaja"&&A=="Ventaja")) {
                            A = "Deuce";
                            B = "Deuce";
                        }
                        break;
                    }

                }
            }
            if (A == "Deuce" && B == "Deuce") 
                System.out.println("Deuce");
            else if (A=="Ventaja") 
                System.out.println(A+" A");
            else if(B=="Ventaja")
                System.out.println(B+" B");
            else
            System.out.println(A+" - "+B);

        }
        return false;
    }
}