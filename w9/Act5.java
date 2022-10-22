package w9;

import java.util.*;
public class Act5 {
    public static ArrayList<Integer> valuesIn() {
        ArrayList<Integer> valueList = new ArrayList<Integer>();
        System.out.println("Enter positives integer." + " Enter a negative integer to stop.");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num > 0) {
            valueList.add(num);
            num = sc.nextInt();
        }
        sc.close();
        return valueList;
    }

    public static void printBarChart(ArrayList<Integer> valueList) {
        for (int i = 0; i < valueList.size(); i++) {
            int value = valueList.get(i);
            for (int j = 0; j < value; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> valueList = valuesIn();
        printBarChart(valueList); 
    }
}
