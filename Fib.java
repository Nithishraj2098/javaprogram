import java.util.Scanner;

public class Fib{
	public static void main(String[] agrs){
		int num,num1=0,num2=1,num3;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		num=sc.nextInt();
		System.out.println(num1+"\t"+num2+",");
		for(int i=0;i<=num;i++)
		{
			num3=num1+num2;
			System.out.println(num3+"\t");
			num1=num2;
			num2=num3;
			


		}

	}
}