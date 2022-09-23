/*Searching the lowset value by using i and after all the comparison
inter change tha value*/
import java.util.Scanner;
public class Selectionsort{
public static void main(String[] agrs){
	int num,small;
	int[] arr=new int[100];
	System.out.println("Enter the number boss : ");
	Scanner sc=new Scanner(System.in);
	num=sc.nextInt();
	for(int i=0;i<num;i++)
	{
		arr[i]=sc.nextInt();  //for input
	}	
	for(int j=0;j<num;j++){// staring node
	    small=arr[j];       // assinging starting value as small;
		for(int k=j+1;k<num;k++){ //nex node
			if(arr[j]>arr[k]) 
			{
				small=arr[k];
				arr[k]=arr[j];
				arr[j]=small;
			}
		}
	}
	System.out.println("\n");
	for(int z=0;z<num;z++)
	{
		System.out.println(""+arr[z]);
	}

}

}