package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

//list classes allow duplicate elements
//Set classes dont allow duplicate elements

//HashSet doesnt give the gurrantee of elements order
//LinkedHashSet gives the gurrantee of elements order

//TreeSet gives elemenst in sorted order ( by default - ascending)

//Collection interface parent of - List, Set interface

//List interface parent of - AL, LL
//Set Interface parent - HS,LHS, TS
public class MoreCollections {

	public static void main(String[] args) {
		//List<Integer> al=new ArrayList<>(Arrays.asList(11,55,22,55,33));
		
		ArrayList<Integer> al=new ArrayList<>(Arrays.asList(11,55,22,55,33));
		System.out.println(al);
		
		LinkedList<Integer> ll=new LinkedList<>(Arrays.asList(11,55,22,55,33));
		System.out.println(ll);
		
		HashSet<Integer> hs=new HashSet<>(Arrays.asList(11,55,22,55,33));
		System.out.println(hs);
		
		LinkedHashSet<Integer> lhs=new LinkedHashSet<>(Arrays.asList(11,55,22,55,33));
		System.out.println(lhs);
		
		TreeSet<Integer> ts=new TreeSet<>(Arrays.asList(11,55,22,55,33));
		System.out.println(ts);
		
		ArrayList<String> al1=new ArrayList<>(Arrays.asList("Z","C","E","Z","A"));
		System.out.println(al1);
		
		LinkedList<String> ll1=new LinkedList<>(Arrays.asList("Z","C","E","Z","A"));
		System.out.println(ll1);
		
		HashSet<String> hs1=new HashSet<>(Arrays.asList("Z","C","E","Z","A"));
		System.out.println(hs1);
		
		LinkedHashSet<String> lhs1=new LinkedHashSet<>(Arrays.asList("Z","C","E","Z","A"));
		System.out.println(lhs1);
		
		TreeSet<String> ts1=new TreeSet<>(Arrays.asList("Z","C","E","Z","A"));
		System.out.println(ts1);
		

	}

}
