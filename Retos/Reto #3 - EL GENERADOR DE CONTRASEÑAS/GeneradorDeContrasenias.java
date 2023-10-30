import java.util.Random;
import java.util.Scanner;

public class GeneradorDeContrasenias {

    public static void main(String[] args) {
        generador();
    }

    static void generador() {
        String password = "";
        System.out.println(auxGenerador(password));
    }

    static String auxGenerador(String password) {
        String cLetters = "", numbers = "", symbols = "", auxPassword="";
        Scanner sc = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        Boolean next = false;
        int lenght;
        char letter;

        Random random = new Random();

        do {
            System.out.println("Chosse the password lenght between 8 and 16 characters: ");
            lenght = scInt.nextInt();
            if (8 <= (int) lenght && (int) lenght <= 16) {
                next = true;
            }
        } while (!next);

        next = false;

        
        do {

            System.out.println("The password with or without capital letters (Y/N)");
            letter = sc.nextLine().charAt(0);
            if (letter == 'Y' || letter == 'y') {
                for (int i = 65; i < 91; i++) {
                    cLetters += (char) i;
                }
                for (int i = 97; i < 123; i++) {
                    cLetters += (char) i;
                }
                next = true;
            } else if (letter == 'N' || letter == 'n') {
                for (int i = 97; i < 123; i++) {
                    cLetters += (char) i;
                }
                next = true;
            } else {
                System.out.println("It is not a valid option");
            }
        } while (!next);
        next = false;

        do {

            System.out.println("The password with or without numbers (Y/N): ");
            letter = sc.nextLine().charAt(0);
            if (letter == 'Y' || letter == 'y') {
                for (int i = 48; i < 58; i++) {
                    numbers += (char) i;
                }
                next = true;
            } else if (letter == 'N' || letter == 'n') {
                next = true;
            } else {
                System.out.println("It is not a valid option");
            }
        } while (!next);
        next = false;

        do {

            System.out.println("Ther password with or without symbols (Y/N): ");
            letter = sc.nextLine().charAt(0);
            if (letter == 'Y' || letter == 'y') {
                for (int i = 33; i < 48; i++) {
                    symbols += (char) i;
                }
                for (int i = 58; i < 65; i++) {
                    symbols += (char) i;
                }
                for (int i = 91; i < 97; i++) {
                    symbols += (char) i;
                }
                for (int i = 123; i < 127; i++) {
                    symbols += (char) i;
                }
                next = true;
            } else if (letter == 'N' || letter == 'n') {
                next = true;
            } else {
                System.out.println("It is not a valid option");
            }
        } while (!next);

        auxPassword=cLetters+numbers+symbols;

        for (int i = 0; i < lenght; i++) {
            password += auxPassword.charAt(random.nextInt(auxPassword.length()));
        }
        
        return password;
    }
}