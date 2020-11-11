package altimetrik.raj;



/*
*  // Create a program using arrays that sorts a list of integers in descending order.
        // Descending order is highest value to lowest.
        // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
        // ultimately have an array with 106,81,26, 15, 5 in it.
        // Set up the program so that the numbers to sort are read in from the keyboard.
        // Implement the following methods - getIntegers, printArray, and sortIntegers
        // getIntegers returns an array of entered integers from keyboard
        // printArray prints out the contents of the array
        // and sortIntegers should sort the array and return a new array containing the sorted numbers
        // you will have to figure out how to copy the array elements from the passed array into a new
        // array and sort them and return the new sorted array.
   */

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter The Number of Processing...");
        int n;
        n=sc.nextInt();
        int[] array_Numbers=getIntegers(n);
        System.out.println("The Array Numbers are...");
        printArray(array_Numbers);
        System.out.println("Arranged in Descending Order...");
        sortIntegers(array_Numbers);

    }

    private static void sortIntegers(int[] array_numbers) {
        int temp=0;
        for (int i=0;i<array_numbers.length;i++){
            for(int j=i+1;j<array_numbers.length;j++){
                if (array_numbers[i]<array_numbers[j]){
                    temp=array_numbers[i];
                    array_numbers[i]=array_numbers[j];
                    array_numbers[j]=temp;
                }
            }

        }
        printArray(array_numbers);

    }

    private static void printArray(int[] array_numbers) {
        for (int i=0;i<array_numbers.length;i++){
            System.out.println(array_numbers[i]);
        }
    }

    private static int[] getIntegers(int n) {
        int[] MyArray=new int[n];
        System.out.println("Enter "+ n+" numbers");
        for (int i=0;i<n;i++){
            MyArray[i]=sc.nextInt();
        }
        return MyArray;
    }
}
