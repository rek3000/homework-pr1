package w5;

import java.util.*;
public class Rev2 {
    public static void smallLarge(int[] nums) {
        int smallest, largest;
        smallest = nums[0];
        for (int i = 0; i < 5; i++) {
            if (smallest > nums[i]) {
                smallest = nums[i];
            }
        }
        System.out.println(smallest + " is the smallest number");

        largest = nums[0];
        for (int i = 0; i < 5; i++) {
            if (largest < nums[i]) {
                largest = nums[i];
            }
        }
        System.out.println(largest + " is the largest number");
    }

    public static void count(int[] nums) {
        int oddCount = 0, evenCount = 0;
        for (int i = 0; i < 5; i++) {
            if (nums[i] % 2 == 0) {
                evenCount++;
            } else {oddCount++;}
        }
        System.out.println("The numbers of even number is" + evenCount);
        System.out.println("The numbers of odd number is" + oddCount);
    }

    public static void cumulative(int[] nums) {
        int[] cumulative;
        cumulative = new int[5];
        for (int i = 0; i < 5; i++) {
            cumulative[i] += cumulative[i];
        }
        System.out.println(Arrays.toString(cumulative));
    }

    public static void duplicate(int[] nums) {
        System.out.println("Adjacent duplicate: ");
        for (int i = 0; i < 4; i++) {
            if (nums[i] == nums[i + 1]) {
                System.out.print(nums[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 input: ");
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            nums[i] = sc.nextInt(); 
        }
        sc.close();

        duplicate(nums);
    }
}
