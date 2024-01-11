package selfpractice;

public class IncrementDecrementQuiz {
	public static void main(String[] args) {
		System.out.println("The output of 1st program is: ");
		int i = 11;
		// i = i++ + ++i;
		i = i++ - --i + ++i - i--; // 1-0+2-1
		// i =i--; // O/P = 1
		// i=i++; // O/P = 1
		// i= --i; // O/P = 0
		// i= i--; // O/P = 1
		// i= ++i; // O/P = 2
		System.out.println(i);

		System.out.println("*******************************");

		int a = 11, b = 22, c;
		System.out.println("The output of 2nd program is: ");
		c = a + b + a++ + b++ + ++a + ++b;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);

		System.out.println("*******************************");

		int p = 1, j = 2, k = 3;
		int m = p-- - j-- - k--;
		System.out.println("The output of 3rd program is: ");
		System.out.println("p=" + p);
		System.out.println("j=" + j);
		System.out.println("k=" + k);
		System.out.println("m=" + m);

		System.out.println("*******************************");

		int o = 1, n = 2, q = 0;
		int z = --n - ++o + ++n - --o;
		int z1 = o-- - n-- - q--;
		System.out.println("The output of 4th program is: ");
		System.out.println(z);
		System.out.println(z1);

		System.out.println("*******************************");

		int m1 = 0, n1 = 0;
		int p1 = --m1 * --n1 * n1-- * m1--;
		System.out.println("The output of 5th program is: ");
		System.out.println(p1);
		
		System.out.println("*******************************");

		int ch = 'A';
		System.out.println(ch++);
		System.out.println("The incremented value is: " +ch+ " "+ "and The character at the incremented acsii code is: " +(char)ch);
		
		System.out.println("*******************************");
		
		
	}
}