package strings;

public class StringMethodsExtra {

	public static void main(String[] args) {
						//  012345678 
			String country="hindustan";
			
			String substr=country.substring(3, 7);
			System.out.println(substr);
			
			String a="anil",b="anil",c="Anil";
			
			if(a.equals(b))
				System.out.println("Equals");
			else
				System.out.println("Not Equals");
			
			if(a.equals(c))
				System.out.println("Equals");
			else
				System.out.println("Not Equals");
			
			
			if(a.equalsIgnoreCase(c))
				System.out.println("Equals");
			else
				System.out.println("Not Equals");
			
			
			//if(a.length()==b.length())
				
			
			
			
	}

}
