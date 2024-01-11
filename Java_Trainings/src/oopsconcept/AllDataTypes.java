package oopsconcept;
//bit
//8-bit - 1-byte
//1024byte s- 1KB
//1024KB - 1MB
//1024MB - 1GB
public class AllDataTypes {
	public static void main(String[] args) {
		//4-data type belongs to Integer family/Data
			//-128 to +127					byte a		1-byte
			//-32768 to +32767				short a		2-byte
			//-2147483648 to +2147483647	int a		4-byte
			//greater than Integer range		long a		8-byte
		
		//byte a=128; //Error cannot convert int to byte
		
			byte a=127;
			short b=30000;
			int c=2000000000;
			long d=4000000000L;	//l or L
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			
			
		//2-data type which belong to decimal family
			//float		4-bytes
			//double	8-bytes
		//by default decimal value considered as double
		float f=4.5F;		//f or F
		double d1=8.9;
		System.out.println(f);
		System.out.println(d1);
		
		//char & boolean
		char k='d';
		System.out.println(k);
		char g='*',v='#';
		System.out.println(g);
		System.out.println(v);
		
		boolean s1=true;
		boolean s2=false;
		System.out.println(s1);
		System.out.println(s2);

	}

}
