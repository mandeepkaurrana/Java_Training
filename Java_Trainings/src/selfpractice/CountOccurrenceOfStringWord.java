package selfpractice;

import java.util.HashMap;
//  Java program to count occurrences of a word in string
public class CountOccurrenceOfStringWord {
	public void countWord(String string) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		String[] strArray = string.split(" ");
		for (String s : strArray) {
		if (map.containsKey(s)) {
		map.put(s, map.get(s) + 1);
		} else {
		map.put(s, 1);
		}
		}
		System.out.println(map);
		}

		public static void main(String[] args) {
		CountOccurrenceOfStringWord occurrence=new CountOccurrenceOfStringWord();
		occurrence.countWord("Practice makes a Man perfect");
		}
		}
