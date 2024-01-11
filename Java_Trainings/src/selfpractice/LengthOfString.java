package selfpractice;

// Java program to find the length of String without using length() method.
public class LengthOfString {
public static void findLengthOfString(String s){
char[] charArray=s.toCharArray();
int length=0;
for (@SuppressWarnings("unused") char c: charArray) {
length++;
}
System.out.println("Lenth of " +s+": "+length);
}

public static void main(String[] args) {
findLengthOfString("Keerthana");
findLengthOfString("Where there is a will there\'s a way");
findLengthOfString("Java practice package contains my practice work");
}
}