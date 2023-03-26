package day6;

public class Array5D 
{
	//private int arr[][]= new int[5][5];
	private int evencount, oddcount;
	
	private int var[][]= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},
			{16,17,18,19,20},{21,22,23,24,25}};
	public void display() 
	{
		for(int i=0;i<5;i++) 
		{
			for (int j=0;j<5;j++) 
			{
				System.out.println(var[i][j]+" ");
			}
			System.out.println();
		}
	}
	public void countEvenOdd() 
	{
		for(int i=0;i<5;i++) 
		{
			for (int j=0;j<5;j++) 
			{
				if(var[i][j]%2==0)
					evencount++;
				else
					oddcount++;
			}
			System.out.print("Even count = "+evencount);
			System.out.println(" Odd count = " +oddcount);
			evencount=0;
			oddcount=0;
		}
	}
}
