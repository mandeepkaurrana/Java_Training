package doubts;

public class StringPalindrome {

	public static void main(String[] args) {
		
		        //01234				String length =5   5/2=2
		String s="nitin";		
		//String s="nitan";
		
		int last=s.length()-1;		//last=4
		
		boolean flag=true;
		for(int i=0;i<=s.length()/2;i++)
		{
			if(s.charAt(i)!=s.charAt(last))	//n != n false
			{								//i != i false
				flag=false;					//t != t false
				break;
			}
			last--;  //last=3,2
		}
		
		if(flag==true)
			System.out.println("String is Palindrome");
		else
			System.out.println("String is Not Palindrome");
		
		

	}

}
