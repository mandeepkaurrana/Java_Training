package leftovers;

import java.util.ArrayList;
import java.util.Arrays;

public class CopyCollection {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>(Arrays.asList(11,44,22,55,33));
		
		ArrayList<Integer> b=new ArrayList<>(a);
		
		System.out.println(a);
		System.out.println(b);
	}

}
