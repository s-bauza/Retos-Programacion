import java.time.*;

public class ElGeneradorPseudoaleatorio {

    public static void main(String[] args) {
        try {
            for (int i = 0; i < 101; i++) {
                Thread.sleep(1000);
                System.out.println(nAleatorio());
            }
        } catch (InterruptedException e) {
            System.err.println(e);
        }

    }

    static int nAleatorio() {
        return LocalTime.now().getNano() % 101;
    }
}
