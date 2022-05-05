
import java .util.Scanner;
class Sorting{
	
	void sort(int arr[]){
		int n=arr.length-1;
		int key=arr[n];
		for(int j=n-1;j>=0;j--){
			if(arr[j]>key){
				arr[j+1]=arr[j];
				display(arr,n);
			}
			else if(arr[j]<key&&arr[j+1]>key){
				arr[j+1]=key;
				display(arr,n);
			}
	
		}
	}
	void display(int arr[],int n){
         for(int j=0;j<=n;j++){
		 System.out.print(arr[j]+" ");}
		 System.out.println();
	}
		
	
	
	
	public static void main(String [] args){
		Sorting s=new Sorting();
		Scanner sc=new Scanner(System.in);
	System.out.println("Number of element");
	int i=sc.nextInt();
	int arr[]=new int [i];
	for(int j=0;j<i;j++){
		arr[j]=sc.nextInt();
	}
	  s.sort(arr);
	}
}
