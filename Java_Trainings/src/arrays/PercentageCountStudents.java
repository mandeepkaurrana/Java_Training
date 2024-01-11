package arrays;
//WAP for array of 10 integers that is a % marks of 10 students, Count Students who scored >=74,>=60,>=40 & less than 40
public class PercentageCountStudents {

	public static void main(String[] args) {
		
		int arr[]= {30,40,50,60,70,80,90,29,78,100,10,100,75};
		int count1=0,count2=0,count3=0,count4=0;
		
			for(int i=0;i<arr.length;i++)
			{
				
			if (arr[i]>=75)
					{ 
				    	count1= count1+1;
									
					}else if (arr[i]>=60)
							{
						 		count2=count2+1;
												
							}else if (arr[i]>=40)
									{
								 		count3= count3+1;
												
										}else {
													count4= count4+1;
												}
						}
			System.out.println("Total number of students who scored more than 75% marks: "+count1);
			System.out.println("Total number of students who scored more than 60% marks: "+count2);
			System.out.println("Total number of students who scored more than 40% marks: "+count3);
			System.out.println("Total number of students who scored less than 40% marks: "+count4);
			}
	
  
}
