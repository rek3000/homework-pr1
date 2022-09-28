package w5;

import java.util.*;
public class Act3 {
    public static void main(String[] args) {
        int size;  
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the number of values: ");  
        size = sc.nextInt();
        double[] array = new double[size];
        System.out.println("Enter the elements of the array: ");  
        for (int i = 0; i < size; i++) {  
        array[i] = sc.nextDouble();  
        }
        sc.close();  
        System.out.print("Array elements are: ");  
        for (int i = 0; i < size; i++) {  
        System.out.print(array[i] + " ");
        }
        System.out.println();

        average(size, array);
    }
    
    public static void average(int size, double[] array) {
        double sum = 0;
        for(int i = 0; i < size; i++) {  
            sum += array[i];
        }
        double average = sum / array.length;
        System.out.println("The average of the values is " + average);
    }

    public static void smallest(int size, double[] array) {
        double smallest = array[0];
        for(int i = 0; i < size; i++) {  
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        System.out.println("The smallest value is " + smallest);
    }

    public static void largest(int size, double[] array) {
        double largest = array[0];
        for(int i = 0; i < size; i++) {  
            if (largest < array[i]) {
                largest = array[i];
            }
        }
        System.out.println("The largest value is " + largest);
    }

    public static void range(int size, double[] array, double largest, double smallest) {
        double range = largest - smallest;
        for(int i = 0; i < size; i++) {  
            if (smallest > array[i]) {
                smallest = array[i];
            }
            
            if (largest < array[i]) {
                largest = array[i];
            }
        }
        System.out.println("The range is " + range);
    }
}
