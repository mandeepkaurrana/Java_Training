package loops;


//if you forcefully convert a int to char
//then it will print it unicode
//0-65535
//A-Z -65-90
//a-z -97-122

//{ } ( ) - & % $ # @ ! ^
//0-9 45-57

public class AlphbetsPrint {

	public static void main(String[] args) {
		
		for(int r=65;r<=70;r=r+1)
		{
			for(int c=65;c<=r;c=c+1)
			{
				System.out.print((char)c+" ");
			}
			System.out.println();
		}
		//int a=65;
		//char b=(char)a; //b=A
		//int c=(int)b;  //c=65
	}
}


//1
//123
//12345
//1234567

//*
//# #
//* * *
//# # # #


//*
//* #
//* # *
//* # * #


//1
//13
//135
//1357

















