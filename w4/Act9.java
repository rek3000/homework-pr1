package w4;
import java.util.Arrays;
public class Act9 {
    public static void main(String[] args) {
        int [] fibo = new int[10];
        fibo[0] = 0; fibo[1] = 1;
        int i;
        for (i = 2; i < fibo.length; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        System.out.println("The Fibonacci numbers list:");
        System.out.println(Arrays.toString(fibo));
    }
}
