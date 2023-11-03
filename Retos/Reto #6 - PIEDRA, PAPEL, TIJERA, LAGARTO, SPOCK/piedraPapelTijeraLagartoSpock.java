
public class piedraPapelTijeraLagartoSpock {
    public static void main(String[] args) {
        String[][] entrada = { { "🗿", "✂️" }, { "✂️", "🗿" }, { "📄", "✂️" } },
                entrada1 = { { "🗿", "✂️" }, { "✂️", "🗿" }, { "✂️", "📄" } },
                entrada2 = { { "🗿", "✂️" }, { "✂️", "🗿" } };

        System.out.println(partida(entrada));
        System.out.println(partida(entrada1));
        System.out.println(partida(entrada2));

    }

    static String partida(String[][] entrada) {

        return auxPartida(entrada);
    }

    static String auxPartida(String[][] entrada) {

        String[] resultado = { "Player 1", "Player 2", "Tie" };
        int contP1 = 0, contP2 = 0;

        for (int i = 0; i < entrada.length; i++) {
            int j = 0;
            switch (entrada[i][j]) {
                case "🗿":
                    if (entrada[i][j + 1] == "✂️" || entrada[i][j + 1] == "🦎") {
                        contP1++;
                    } else if (entrada[i][j + 1] == "🗿")
                        break;
                    else
                        contP2++;
                    break;
                case "📄":
                    if (entrada[i][j + 1] == "🗿" || entrada[i][j + 1] == "🖖") {
                        contP1++;
                    } else if (entrada[i][j + 1] == "📄")
                        break;
                    else
                        contP2++;
                    break;
                case "✂️":
                    if (entrada[i][j + 1] == "📄" || entrada[i][j + 1] == "🦎") {
                        contP1++;
                    } else if (entrada[i][j + 1] == "✂️")
                        break;
                    else
                        contP2++;
                    break;
                case "🦎":
                    if (entrada[i][j + 1] == "📄" || entrada[i][j + 1] == "🖖") {
                        contP1++;
                    } else if (entrada[i][j + 1] == "🦎")
                        break;
                    else
                        contP2++;
                    break;
                case "🖖":
                    if (entrada[i][j + 1] == "🗿" || entrada[i][j + 1] == "✂️") {
                        contP1++;
                    } else if (entrada[i][j + 1] == "🖖")
                        break;
                    else
                        contP2++;
                    break;
                default:
                    System.out.println("404");

            }

        }

        if (contP1 > contP2)
            return resultado[0];
        else if (contP1 < contP2)
            return resultado[1];
        else
            return resultado[2];
    }

}
