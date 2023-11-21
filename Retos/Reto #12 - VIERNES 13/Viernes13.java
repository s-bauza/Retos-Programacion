import java.util.Calendar;

public class Viernes13 {
    public static void main(String[] args) {
        mesViernes13(2023);
    }

    static void mesViernes13(int año) {
        for (int i = 0; i < 12; i++) {
            System.out.println(auxMesViernes13(i, año)); // True
        }
    }

    static boolean auxMesViernes13(int mes, int año) {
        // Algoritmo de Zeller
        Calendar calendar = new Calendar.Builder().setDate(año, mes, 13).build();
        if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY) {
            return true;
        }

        return false;
    }
}
