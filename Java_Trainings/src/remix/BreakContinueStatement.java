package remix;

public class BreakContinueStatement {
//break and continue only concerned with loop body
//break used to forcefully quit from the loop body 
	//but break based on conditional statement
	public static void main(String[] args) {
		
		for(int i=1;i<=50;i++) 
		{
			if(i==3)
			{
				break;		//quit from the loop body
			}
			System.out.println(i); // 1  2

		}
		
		for(int i=1;i<=5;i++) 
		{
			if(i==3)
			{
				continue;   //skip the next part of the loop
			}
			System.out.println(i);//1  2  4  5
		}
	}
}


//Table of an Integer
//power to base


//1
//121
//12321
//1234321
//123454321

//DCBA
//DCB
//DC
//D

//* * * * *
//*       *
//*       *
//*       *
//* * * * *


//*
//* *
//*  *
//*   *
//*     *
//* * * * *








