package doubts;

public class StringFrequency {

	public static void main(String[] args) {

		
		String s="aa ddd rrr aaa eee ttt ff ss";
		                         //   0   1   2   3   4   5   6
		char c[]=s.toCharArray(); //['a','n','a','m','i','k','a']
		                           //'0',n,'0',               '0' 
		
		for(int i=0;i<c.length;i++)
		{
			  char ch=c[i];//ch='a','n','a'
			  int count=0;
			  boolean flag=false;
			  for(int j=0;j<c.length;j++)
			  {
				if(c[j]==ch && c[j]!='0' && c[j]!=' ')
				{
					count=count+1;  //1,2,3
					c[j]='0';
					flag=true;
				}
		   	  }
            
			  if(flag==true)
			    System.out.println(ch+" occur "+count);
            
			
		}
		
	}

}
