package doubts;

public class StringQuery {

	public static void main(String[] args) {
			String s="Anamika";
			//s=s.toLowerCase();
			int c=0;
			for(int i=0;i<s.length();i++) 
			{
				if(s.charAt(i)=='a'||s.charAt(i)=='A')
				{
					c=c+1;
				}
			}
			System.out.println(c);
			
			
			
	}

}
