package w9;

public class Act4 {
    public static void main(String[] args) {
        int min = 2;
        int max = 1000;
        int percentage = 0;

        System.out.println("Numbers generated:");
        for (int i = 0; i < 100; i++) {
            int r = (int)(Math.random() * (max - min + 1) + min);
            System.out.print(r + " ");
            if (isPrime(r)) {
                percentage++;
            }
        }
        System.out.println();
        System.out.println("Probability that a number is a prime number: " + percentage + "%");
    }

    static  boolean isPrime(int r) {
        if (r <= 1) {
            return false;
        }
        for (int i = 2;i <= r / 2; i++) {
            if((r % i) == 0)
            return false;
        }
        return true;
    }
}
