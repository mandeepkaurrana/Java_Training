package strings;

public class StringMoreMethods {

	public static void main(String[] args) {

				//0123
		String a="amit sharma";
		
		System.out.println(a.charAt(0));
		System.out.println(a.charAt(2));
		
		for(int i=0;i<a.length();i++)
		{
			System.out.println(a.charAt(i));
		}
		
		int c=0;
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)=='m')
				c=c+1;
		}
		System.out.println("Char count : "+c);
	}

}
