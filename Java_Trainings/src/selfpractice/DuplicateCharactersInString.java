package selfpractice;
import java.util.*;
// Java program to find the duplicate characters in a String.

public class DuplicateCharactersInString {
public static void main(String[] args) {
findDuplicateCharacter("Test data");
findDuplicateCharacter(" Keerthana");
}
public static void findDuplicateCharacter(String s) {
LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
char[] charArray = s.toCharArray();
for (char c :
charArray) {
if (map.containsKey(c)) {
map.put(c, map.get(c) + 1);
} else {
map.put(c, 1);
}
}
Set<Map.Entry<Character, Integer>> set = map.entrySet();
System.out.println("Duplicate characters in a string " + s + ":");
for (Map.Entry<Character, Integer> entry : set) {
if (entry.getValue() > 1) {
System.out.println(entry.getKey() + ": " + entry.getValue());
}
}
}
}