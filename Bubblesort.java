/*Finding the largest value and interchange with 
smallest value */
import java.util.Scanner;
public class Bubblesort
{
	public static void main(String[] agrs)
	{
		int num,swap;
		int digit=0;
		int[] arr=new int[100];
		
		System.out.println("Enter the range of array : ");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		for(int i=0;i<num;i++)
		{
			
			arr[i]=sc.nextInt();

		}
		for(int k=0;k<=num;k++)
		for(int j=0;j<num-k-1;j++)
		{
			if(arr[j]>arr[j+1])
			{
				swap=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=swap;
			}
		}
		for(int z=0;z<num;z++)
		{
			System.out.println("\n"+arr[z]);
		}
		

	}
}