package remix;

public class IncDecOperator {

	public static void main(String[] args) {
		int a=10;
		
		a=a+1;			//a=a+5   a=a+7
		System.out.println(a);
		
		a++;			//only one increment
		System.out.println(a);
		
		++a;			//only one increment
		System.out.println(a);
		
		a+=1;			//a+=5  a+=7
		System.out.println(a);
		
		for(int i=1;i<=5;i++) {	}
		for(int i=1;i<=5;i=i+1) {	}
		for(int i=1;i<=5;++i) {	}
		for(int i=1;i<=5;i+=1) {	}
		
		
		//a++  a--  ++a  --a
	
	
	}

}
