package w2;
    import java.util.Scanner;
    public class Act5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so xu: ");
        int a = sc.nextInt();
        sc.close();
        
        int quan = a / 10000;
        int dong = (a % 10000) /100;
        int hao = (a % 100) / 10;
        int xu = a % 10;
        System.out.println(quan + " quan, " + dong + " dong, " + hao + " hao, " + xu + " xu");
    }
}

