package strings;

public class StringDemo {
//Note : Every method of String class gives you a new String
	
	public static void main(String[] args) {
		
		String a="Amit Kumar Sharma";
		
		System.out.println("hello "+a);
		
		String a1=a.toUpperCase();
		
		System.out.println("String in uppercase : "+a1);
		System.out.println("Original String : "+a);
		
		int y=a.length();
		System.out.println(y);
		
		String h=a.toLowerCase();
		System.out.println(h);
		
		
		System.out.println(a.toUpperCase());

	}

}
