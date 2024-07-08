
import java.util.*;
public class Main {
    public static void main(String[] args) {
        /*
        1.Write a Java program to test if the first and the last element of an array of
integers are same. The length of the array must be greater than or equal to
2
Test Data:
array = 50, -20, 0, 30, 40, 60, 10
Sample Output:
false/*
         */
        int[] array = {50, -20, 0, 30, 40, 60, 10};

        boolean result = array.length >= 2 && array[0] == array[array.length - 1];

        System.out.println("Result: " + result);
        /*
        2.Write a Java program to find the numbers greater than the average of the
numbers of a given array.
Original Array:
[1, 4, 17, 7, 25, 3, 100]
Expected Output:
The average of the said array is: 22.0 The numbers in the said array that are
greater than the average are: 25 100
         */
        int[] arr = {1, 4, 17, 7, 25, 3, 100};
        int sum = 0;
        int count = 0;
        for (int num : arr) {
            sum += num;
        }
        double average = (double) sum / arr.length;
        System.out.println("The average of the said array is: " + average);

        System.out.print("The numbers in the said array that are greater than the average are: ");
        for (int num : arr) {
            if (num > average) {
                System.out.print(num + " ");
                count++;
            }
        }
        if (count == 0) {
            System.out.print("None");
        }

      /*  3.Write a Java program to get the larger value between first and last
        element of an array of integers.
        Original Array:
[20, 30, 40]*/
        int[] array4 = {20, 30, 40};

        int firstElement = array4[0];
        int lastElement = array4[array4.length - 1];

        int largerValue;
        if (firstElement > lastElement) {
            largerValue = firstElement;
        } else {
            largerValue = lastElement;
        }
        System.out.println("Original Array: " + array[0] + ", " + array[1] + ", " + array[2]);
        System.out.println("Larger value: " + largerValue);

      /*  4.Write a Java program to swap the first and last elements of an array and
        create a new array.
                Original Array:
[20, 30, 40]
        Sample Output:
        New array after swapping the first and last elements: [40, 30, 20]
*/
        int[] array5 = {20, 30, 40};

        int[] swappedArray = new int[array5.length];
        swappedArray[0] = array5[array5.length - 1];
        swappedArray[array5.length - 1] = array5[0];

        for (int i = 1; i < array5.length - 1; i++) {
            swappedArray[i] = array5[i];
        }
        System.out.print("Original Array: [");
        for (int i = 0; i < array5.length; i++) {
            System.out.print(array5[i]);
            if (i < array5.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.print("New array after swapping the first and last elements: [");
        for (int i = 0; i < swappedArray.length; i++) {
            System.out.print(swappedArray[i]);
            if (i < swappedArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
            /*
            5. Write a program that places the odd elements of an array before the
even elements.
Original Array:
[2,3,40,1,5,9,4,10,7
             */

        int[] originalArray = {2, 3, 40, 1, 5, 9, 4, 10, 7};
        List<Integer> odds = new ArrayList<>();
        List<Integer> evens = new ArrayList<>();

        for (int num : originalArray) {
            if (num % 2 == 1) {
                odds.add(num);
            } else {
                evens.add(num);
            }
        }
        odds.addAll(evens);

        int[] resultArray = new int[originalArray.length];
        for (int i = 0; i < odds.size(); i++) {
            resultArray[i] = odds.get(i);
        }
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Sample Output: " + Arrays.toString(resultArray));
  /*
  6. Write a program that test the equality of two arrays.
[2,3,6,6,4] [2,3,6,6,4]
Sample Output:
true
   */
        int[] arr1 = {2, 3, 6, 3, 4};
        int[] arr2 = {2, 3, 6, 6, 4};

        if (arr1.length != arr2.length) {
            System.out.println("false");
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                System.out.println("false");
            }}
        System.out.println("true");}}










