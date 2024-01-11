package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapClasses {

	public static void main(String[] args) {
		//you want to keep data in key-value pair/form
		//key must be unique
		//value can be duplicate
		//cricketername-sixes
		//rno-marks
		//indiastate-populations
		//empcode-salary
		//candidate-votes
		//footballplayer-goals
		//telephoneno-bill
		//item-price
		//adhaarno-rice
		
		//Map interface is parent of all 3-map classes
		
		HashMap<String,Integer>hmap=new HashMap<>();
		hmap.put("Sehwag",234);
		hmap.put("Sachin",15);
		hmap.put("Sehwag",123);//it will replace the existing one
		hmap.put("Gayle",420);
		hmap.put("Dravid",15);
		System.out.println(hmap);
		
		LinkedHashMap<String,Integer>lhmap=new LinkedHashMap<>();
		lhmap.put("Sehwag",234);
		lhmap.put("Sachin",15);
		lhmap.put("Sehwag",123);//it will replace the existing one
		lhmap.put("Gayle",420);
		lhmap.put("Dravid",15);
		System.out.println(lhmap);
		
		TreeMap<String,Integer>tmap=new TreeMap<>();
		tmap.put("Sehwag",234);
		tmap.put("Sachin",15);
		tmap.put("Sehwag",123);//it will replace the existing one
		tmap.put("Gayle",420);
		tmap.put("Dravid",15);
		System.out.println(tmap);
		

	}

}
