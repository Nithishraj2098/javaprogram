import java.util.Scanner;
 public class Array{
 	public static void main(String[] agrs)
 	{
 		int num;
 		Scanner sc=new Scanner(System.in);
 		System.out.println("Enter the value");
 		num=sc.nextInt();
 		int[] arr=new int[num];
 		for(int i=0;i<num;i++)
 			arr[i]=sc.nextInt();
 		for(int x:arr)
 			System.out.println(x);
 	}
 }