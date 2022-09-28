package w5;

import java.util.*;
public class Act4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your credit card number: ");
        String str = sc.nextLine();
        sc.close();
        
        // xoa ki tu dac biet
        str = str.replaceAll("\\s+", "");
        str = str.replaceAll("-", "");
        
        // convert string sang integer
        long num = Long.valueOf(str);
        //System.out.println(num);
        long[] strArr = new long[str.length()];
        
        // long integer -> unit integer
        for (int i = 0; i < str.length(); i++) {
            long remainder = num % 10;
            num = num / 10;
            strArr[strArr.length - i - 1] = remainder;
        } 
        // System.out.println(Arrays.toString(strArr));

        // ting tong tat cac so
        int sum = 0;
        for (int i = 0; i < strArr.length; i++) {
            sum += strArr[i];
        }
        System.out.println(sum);

        // tinh tong cac so thu 2 tu phai sang trai
        int sum2 = 0;
        for (int i = strArr.length - 2; i >= 0; i -= 2) {
            sum2 += strArr[i];
        }
        //System.out.println(sum2);

        // tinh so cac so thu 2 thu phai sang trai nhung > 4
        int sum3 = 0;
        for (int i = strArr.length - 2; i >= 0; i -= 2) {
            if (strArr[i] > 4) {
                sum3++;
            }
        }
        //System.out.println(sum3);

        //System.out.println(sum + sum2 + sum3);

        if ((sum + sum2 + sum3) % 10 == 0) {
            System.out.println("The credit card is valid");
        } else {
            System.out.println("The credit card is not valid");
        }
    }
}