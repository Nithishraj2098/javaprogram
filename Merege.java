// Merge sorting.....using divide and conquare Method

import java.util.Scanner;
public class Merege{
public static void main(String[] agrs){
	int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number BOSS : ");
	num=sc.nextInt();
	int[] arr=new int[num];
	for(int i=0;i<num;i++)
		arr[i]=sc.nextInt();
		sort(arr,0,arr.length-1);                    // calling recursive function
		for(int x:arr){
			System.out.println(x);
		}		                                              // above are inputs for array
}
private static void sort(int[] arr,int i,int j)
{
	if(i<j)
	{
		int mid=(i+j)/2;
		sort(arr,i,mid);                      //Using of Recursion
		sort(arr,mid+1,j);
		merge(arr,i,mid,j);
	}
}
private static void merge(int[] arr,int low,int mid,int high)
{
	int i=low;
	int k=low;
	int j=mid+1;
	int[] b=new int[arr.length];
	while(i<=mid&&j<=high)
	{
		if(arr[i]<arr[j]){   /*  50 10 30 40 10 60                  //0<2     //1<2       //2<2 x //2<3 x
			                     0   1  2  3  4  5  */              //b[0]=50  //b[1]=10
			b[k]=arr[i];
			i++;                                                     //1       //2
			k++;                                                     //1       //2


		}
		else{                                             
			b[k]=arr[j];                                             //b[2]=30  //b[3]=40 b[4]=10 b[5]=60
			j++;                                                     //3        //4
			k++;                                                     //3        //4

		}
	}
	while(i<=mid){                                          //0<=2
		b[k]=arr[i];                                         
		i++;
		k++;

	}
	while(j<=high)
	{
		b[k]=arr[j];
		j++;
		k++;
	}
	for( i=low;i<=high;i++)
	{
		arr[i]=b[i];
	}
}
}