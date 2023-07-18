package RotateMatrix;

import java.util.Arrays;
import java.util.Scanner;

public class RotateMatrix {
	
	public static void rotate(int[][] mat,int rows,int cols)
	{
		int [][] trans = new int[cols][rows];
		for(int i=0;i<cols;i++)
		{
			for(int j=0;j<rows;j++)
			{
				trans[i][j] = mat[j][i];
			}
		}
		for(int i=0;i<rows;i++)
		{
			int temp;
			int start = 0;
			int end= cols-1;
			while(start < end )
			{
				temp = trans[i][start];
				trans[i][start] = trans[i][end];
				trans[i][end] = temp;
				start++;
				end--;
			}
		}
		System.out.println(Arrays.deepToString(trans));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int rows = scan.nextInt();
		int cols = scan.nextInt();
		int[][] mat = new int[rows][cols];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				 mat[i][j] = scan.nextInt();
			}
		}
		 rotate(mat,rows,cols);

	}

}
