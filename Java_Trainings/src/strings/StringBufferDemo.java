package strings;

public class StringBufferDemo {

	public static void main(String[] args) {
		String s="Amit";			//Way-1
		
		String t=new String("Amit");//Way-2
		
		System.out.println("s : "+s);
		System.out.println("t : "+t);
		
		StringBuffer k=new StringBuffer("Amit");  //Only a Single Way
		System.out.println("k: "+k);
		
		//String Object are Immutable (fixed Length String)
		//it means String object never update itself
		//They always return a new String when any method applied on them
			
		String g=s.concat(" Kumar");
		System.out.println(g);
		
		//StringBuffer Object are Mutable (Variable Length String)
		//it means StringBuffer object update itself
		//The methods of StringBuffer make them mutable
		//like append() insert() reverse() delete() etc
		
		k.append(" Kumar");
		System.out.println(k);
		
		//charAt() indexOf() length() are same in both classes 
		
		k.insert(0, "Mr. ");
		System.out.println(k);
		
		k.reverse();
		System.out.println(k);
		
		k.reverse();
		System.out.println(k);
		
		

		
		
		
		
		
	}

}
