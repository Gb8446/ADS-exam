import java.util.*;
class A{
	int arr[][]=new int [4][3];
	int arr1[][]=new int [3][4];
       }
	class ADemo{
		
	public static void main(String... args)
	
	{    A a = new A();
	Scanner sc=new Scanner (System.in);
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<3;j++)
		{ a.arr[i][j]=sc.nextInt();}
	
	}
	for(int k=0;k<3;k++)
	{
		for(int j=0;j<4;j++)
		{
			a.arr1[k][j]=sc.nextInt();
		}
	}
	for(int k=0;k<4;k++)
	{
		for(int j=0;j<3;j++)
		{
			System.out.print(a.arr[k][j]+" ");
		}
		System.out.println();
	}
	for(int k=0;k<3;k++)
	{
		for(int j=0;j<4;j++)
		{
			System.out.print(a.arr1[k][j]+" ");
		}
		System.out.println();
	}
	//int h=0;
	for(int k=0;k<4;k++)
	{
	for(int i=0;i<4;i++)
	{  int h=0;
		for(int j=0;j<3;j++)
		  {
			 h = h+(a.arr[k][j]*a.arr1[j][i]);    
	    //System.out.print(a.arr1[i][j]+" ");
	      }
		   System.out.print(h+" ");
	}
	System.out.println();
	}
	
	}
	}