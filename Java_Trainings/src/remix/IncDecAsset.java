package remix;

public class IncDecAsset {

	public static void main(String[] args) {
		
		int s=13;
		//      13   15
		int y= s++ + ++s;
		System.out.println(s+" "+y);
		
				
		int a=10;
		
		     //10 +  12 +  12 +  13   
		int b=a++ + ++a + a++ + a--;
		System.out.println("a : "+a);//12
		System.out.println("b : "+b);//47
		
	    int k=9;  
	    
	        //10 +  9   +  9  +  9
		int g=++k + --k + k++ + --k;
		System.out.println("k: "+k);//9
		System.out.println("g : "+g);//37
	}
}
//Jyoti,  k=8 g=37
//akash k=9 g=37
//mandeep k=9 g=37
//ankush k=9 g=37
//Neha k=8 g=36
