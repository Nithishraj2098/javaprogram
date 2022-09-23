import java.util.Scanner;
class Small{
	public static void main(String[] agrs){
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array value BOSS : ");
		num=sc.nextInt();
		int[] arr=new int[num];
		for(int i=0; i<num;i++)
			arr[i]=sc.nextInt();
		int small=arr[0];
		for(int j=1;j<num;j++)
			if(arr[j]<small)
				small=arr[j];
			System.out.println(small);

	}

}