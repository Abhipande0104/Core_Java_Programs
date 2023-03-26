package day6;

public class Array2D 
{
	//private int arr[][]=new int[3][3];
	
	private int var[][]= {{1,2,3},{4,5,6},{7,8,9}};
	public void display() {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(var[i][j]+" ");
			}
			System.out.println();
		}
	}
}
