package misc;

public class ForEachLoop {

	public static void main(String[] args) {
		
		//Only work on Array & Collection
		//it works only for all elements
		//and in one direction only first to last element
		
		//work on type of element and fetch directly element
		int a[]= {11,33,22,55,44,77,66};
		for(int i:a) 
		{
			System.out.println(i);
		}
		
		String s[]= {"ABC","XYZ","PQR","RST"};
		for(String k:s) {
			System.out.println(k);
		}
	}

}
