package strings;

public class Stringfetch {

	public static void main(String[] args) {
		String s="hello how are you, today I am learning java and its very user friendly";
		
		String k="user";
		
		int sindex=s.indexOf(k);//
		System.out.println(sindex);//19
		
		int klength=k.length();
		System.out.println(klength);//5
		
		          //19,19+5 (24)
		String substr=s.substring(sindex, sindex+klength);
		System.out.println(substr);
		
		
	}

}
