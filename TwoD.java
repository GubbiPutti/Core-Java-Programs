package array;

import java.util.Scanner;

public class TwoD 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		int[][] arr = new int[2][3]; //r*c =2*3 = 6 elements
		
		//Reading 2d elements
		//rows
		for(int i=0;i<2;i++)
		{
			System.out.println("Enter "+(i+1)+ " row elements");
			//columns
			for(int j=0;j<3;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
	//writing 2d elements
		System.out.println("----------------------------");
		System.out.println(" 2D Array Elements\n");
		for(int i=0;i<2;i++)
		{
			//columns
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
//for assignment
//	01 23 14
//	21 05 13
}
