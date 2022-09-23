import java.util.Scanner;
 public class Inc{
 	public static void main(String[] agrs)
 	{
 		int num;
 		Scanner sc=new Scanner(System.in);
 		System.out.println("Enter the value");
 		num=sc.nextInt();
 		int[] arr=new int[num];
        int swap;
 		for(int i=0;i<num;i++)
 			arr[i]=sc.nextInt();
        for(int k=0;k<num;k++)
 		for(int j=0;j<num-1-k;j++)
        {
            if(arr[j]>arr[j+1])
            {
                swap=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=swap;

            }
        }
        for(int x:arr)
            System.out.println(x);

 	}
 }