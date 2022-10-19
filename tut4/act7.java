package week4;
public class act7 {
    public static void main(String[] args) {
        System.out.print("Armstrong number: ");
        for (int i = 100; i <= 1000; i++) {
            int x, sum = 0;
            for (int j = 1; j <= String.valueOf(i).length(); j++) {
                x = i % 10;
                i = i / 10;
                sum = 0 + (x * x * x);
                if (sum == i) {
                    System.out.print(sum + " ");
                }
            }
        }
        System.out.println("done");
    }
}
