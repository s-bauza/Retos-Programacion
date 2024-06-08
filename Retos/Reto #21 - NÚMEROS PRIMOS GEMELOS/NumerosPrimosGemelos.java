public class NumerosPrimosGemelos {

    public static void main(String[] args) {
        System.out.println("Twins prime numbers between 1 and 100");
        twin();
    }

    static int prime(int n){
        if (n==1) {
            return 0;
        }
        for (int i = 2; i < n; i++) {
            if (n%i==0) {
                return 0;
            }
            
        }
        return n;
    }

    static void twin(){
        int isPrime = 0;
        for (int i = 3; i < 100; i++) {
            isPrime = prime(i);
            if (isPrime!=0 && (isPrime-prime(i-2)==2)) {
                System.out.println("("+(i-2) + "," + (i)+")");
            }
        }
    }
}