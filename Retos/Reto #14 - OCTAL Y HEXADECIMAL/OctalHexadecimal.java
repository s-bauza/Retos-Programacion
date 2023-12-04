
public class OctalHexadecimal {
    public static void main(String[] args) {
        System.out.println(
                "500 en decimal es convertido a octal: " + ocatal(500) + " y en hexadecimal: " + hexadecimal(500));
    }

    static int ocatal(int i) {
        int result = 0, m = 1;
        result = i % 8;
        i = i / 8;
        while (i != 0) {
            m *= 10;
            result += i % 8 * m;
            i = i / 8;
        }
        return result;

    }

    static String hexadecimal(int i) {

        String result = "", newResult = "";

        if (i == 0) {
            return newResult += '0';
        }

        while (i != 0) {
            if (i % 16 >= 10 && i % 16 <= 15) {
                if (i % 16 == 10) {
                    result += 'A';
                }
                if (i % 16 == 11) {
                    result += 'B';
                }
                if (i % 16 == 12) {
                    result += 'C';
                }
                if (i % 16 == 13) {
                    result += 'D';
                }
                if (i % 16 == 14) {
                    result += 'E';
                }
                if (i % 16 == 15) {
                    result += 'F';
                }
            } else
                result += String.valueOf(i % 16);
            i = i / 16;
        }

        for (int j = result.length() - 1; 0 <= j; j--)
            newResult += result.charAt(j);

        return newResult;
    }
}