public class LaEscalera {
    public static void main(String[] args) {
        pintarEscalera(-3);
        pintarEscalera(-8);
        pintarEscalera(4);
        pintarEscalera(10);
    }

    static void pintarEscalera(int n) {
        auxPintar(n);
    }

    static void auxPintar(int n) {
        int aux;
        if (n == 0) {
            System.out.println("__");
        } else if (n < 0) {
            n *= -1;
            aux = n;
            for (int i = 0; i <= n ; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("  ");
                }
                if (i == 0) {
                    System.out.println("__");// Añado otro escalon porque sino se cae, debido a la secuencia 1 3 5 7...
                }else
                    System.out.println("|_");
            }

        } else {
            aux = n;
            for (int i = 0; i < n + 1; i++) {
                for (int j = 0; j < aux + 1; j++) {
                    if (j != aux)
                        System.out.print("  ");
                    else {
                        if (i == 0) {
                            System.out.println("_");
                        } else
                            System.out.println("_|");
                        aux--;
                    }
                }
            }
        }

    }

}