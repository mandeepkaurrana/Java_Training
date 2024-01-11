package collections;

import java.util.ArrayList;

public class CollectionDemo {

	public static void main(String[] args) {
		int a[] = { 11, 33, 44, 77, 22, 55 };
		// Collection Framework
		// a lot of inbuilt classes
		// all classes comes under the package java.util

		// these classes help us to collect same type of element like array
		// but they provide a lot of inbuilt operations to perform on that data

		// Classes
		// ArrayList, LinkedList, HashSet, LinkedhashSet, TreeSet
		// HashMap, LinkedhashMap, Treemap etc

		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println(list.size());
		list.add(34);// add at last
		list.add(4);// add at last
		list.add(341);// add at last
		list.add(89);
		System.out.println(list);
		System.out.println(list.size());
		list.add(67);

		System.out.println(list);
		System.out.println(list.size());
		list.add(0, 786);// add at specific location/index
		System.out.println(list);
		System.out.println(list.size());
		list.remove(3);// remove by index
		System.out.println(list);
		System.out.println(list.size());
		list.clear();// to remove all data in one go
		System.out.println(list.size());
		
		System.out.println(a);

	}

}
