package arrays;

//Sorting
//Bubble, insertion, tree, quick, tournament , heap
//selection, merge
//Bubble Sort
//Phase-1	Phase-2   phase-3   --- Phase-n-1
//22		//22		11     11
//66		//11		22     22
//11		//44		33     33
//44		//33		44	   44
//33		//66		66     66
//88		//77		77     77 
//77		//88		88     88
public class SortingArray {
	public static void main(String[] args) {
		int a[] = { 22, 66, 11, 44, 33, 88, 77 };

		// Output : 11,22,33,44,66,77,88
		// Arrays.sort(a);

		int c = 0; // counter variable to find the no.of time the for loop has been executed

		for (int i = 0; i < a.length - 1; i++) {
			int flag = 0;
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1])// 22>66 false 66>11 true
				{
					int t = a[j];// t=66
					a[j] = a[j + 1]; // a[1]=11
					a[j + 1] = t; // a[2]=66
					flag = 1;
				}
				c = c + 1;
			}

			if (flag == 0)
				break;

		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("Number of iterations :" + c);
	}

}

//You have to hence prove the optimization required or not
// if(flag==0)
// break;

//Swapping
//int a=10,b=20

//int c=a;
//a=b;
//b=c;
