package w4;

public class Act2 {
    public static void main(String[] args) {
        System.out.println("List of prime numbers:");
        for (int n = 0; n < 101; n++) {
            boolean isPrime = (n != 1);
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(n + " ");
            }
        }

    }
}
