package w4;

public class Act7 {
    public static void main(String[] args) {
        int i;
         
        for (i = 100; i < 1000; i++) {
            int c = i % 10;
            int b = ((i % 100) - c) / 10;
            int a = i / 100;
            if (a*a*a + b*b*b + c*c*c == i) {
                System.out.println(i);
            }
        }
    }
}
