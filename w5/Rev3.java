package w5;

public class Rev3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = i; j <= i*10; j += i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
