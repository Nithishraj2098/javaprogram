//eg: 30  50 87 76 ==>30 50 76 87
import java.util.Scanner;
class Bubble{
	public static void main(String[] agrs)
	{
		int num,swap;
		int[] arr=new int[100];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number Boss : ");
		num=sc.nextInt();
		for(int i=0;i<num;i++){
			arr[i]=sc.nextInt();

			}                                            //up to this inputs
		for(int z=0;z<num;z++)	
		for(int j=0;j<num-z-1;j++){
			if(arr[j]>arr[j+1])
			{
				swap=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=swap;
			}
		}
		for(int k=0;k<num;k++){
			System.out.println(arr[k]);
		}
		}
	}
