package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//add(e)
//add(index,e)
//remove(i)
//clear()
//get(i)
//size()
//addAll()

//Data Structure Operations
//Insertion
//Deletion
//Searching
//Sorting
//traversing
//merging

public class ArrayListDemo {

	public static void main(String[] args) {
		//You can also skip data type on right side
		ArrayList<Integer> list1=new ArrayList<>(Arrays.asList(33,44,22,66,11,44));
		System.out.println(list1);
		
		ArrayList<Integer> list2=new ArrayList<>(Arrays.asList(99,88));
		System.out.println(list2);
		
		list1.addAll(list2);
		System.out.println(list1);
		
		System.out.println("List1 Elements using regular for");
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		System.out.println("List2 Elements using for-each");
		for(Integer kaka:list2) {
			System.out.println(kaka);
		}
		
		System.out.println(list1.indexOf(66));//find index no of element
		
		if(list1.contains(44))//search for element
			System.out.println("Element Found at "+list1.indexOf(44)+" Index");
		else
			System.out.println("Element not Found");
		
		//list1.remove(new Integer(99));//remove by element
		System.out.println(list1);
		
		Collections.sort(list1);
		System.out.println(list1);//Sort Elements
		
		Collections.sort(list1,Collections.reverseOrder());
		System.out.println(list1);
		
		System.out.println(list1.isEmpty());
		list1.clear();
		System.out.println(list1.isEmpty());
		
		System.out.println();
		
		
	}
	
	
}
