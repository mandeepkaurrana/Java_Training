package selfpractice;
import java.util.Scanner;
//Java program to find the smallest number in an array.
//
//Steps:
//📌 To get a input from a user, we're using Scanner class.
//📌 int n = scanner.nextInt(), get the number of elements we want to store.
//📌 int[] array = new int[n];, creates an array with size n.
//📌 By iterating from 0 to i<n, we can get the elements from user in array[i].
//📌 Then, pass this array as a parameter to the findSmallestArray() method.
//📌 Where, we say Integer.MAX_VALUE as the smallest number.
//📌 Next, we are comparing array[i] less than smallest number. If so, we need to change the smallest number as array[i].
//📌 Alternatively, you can use Arrays.sort() to sort the array and can say array[0] as smallest.

public class SmallestNumberInArray {
public static void main(String[] args) {
@SuppressWarnings("resource")
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the number of elements: ");
int n = scanner.nextInt();
int[] array = new int[n];
System.out.println("Enter the elements of the array: ");
for (int i = 0; i < n; i++) {
array[i] = scanner.nextInt();
}
}
}