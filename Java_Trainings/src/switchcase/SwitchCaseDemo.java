package switchcase;

//Semicolon never Used 
//class
//main()
//if()
//else
//do
//while()
//for()
//switch()
public class SwitchCaseDemo 
{
	public static void main(String[] args) 
	{
		
		//Equality Comparison : ==
		//print day name as per day number
		
		int n=3; 
		switch(n) //it directly jump to case number as per switched number
		{
		default:
			System.out.println("Invalid Choice");
			break;
		case 7:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 1:
			System.out.println("Wednesday");
			break;
		case 2:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 5:
			System.out.println("Saturday");
			break;
		case 4:
			System.out.println("Sunday");
			break;
		
			
		}
	}
}


//String browser="chrome";

//switch(browser)
//{
//case "chrome":
	
//case "firefox":
	
//case "safari":
	

//}

