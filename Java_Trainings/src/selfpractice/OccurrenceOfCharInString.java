package selfpractice;

import java.util.Scanner;
//  Java program to count the occurrences of a particular character in a String
public class OccurrenceOfCharInString {
public void occurrenceOfCharInStr(String str) {
int occurrence = 0;
@SuppressWarnings("resource")
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the character to find: ");
char toFind = scanner.next().charAt(0);
str=str.toLowerCase();
char[] charArray = str.toCharArray();
for (int i = 0; i < charArray.length; i++) {
if (toFind == charArray[i]) {
occurrence++;
}
}
System.out.println("Character "+toFind+" presence " +occurrence+ " times");
}
public static void main(String[] args) {
OccurrenceOfCharInString occurrence = new OccurrenceOfCharInString();
occurrence.occurrenceOfCharInStr("Mandeep");
}
}