// quwstion:
   //input string as # and * if # is great negative and * is greate positive..both eual na zero

import java.util.Scanner;
public class Equals{
	public static void main(String[] agrs)
	{
		String str;
		char n;
		int count=0;
		int count1=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String BOSS : ");
		str=sc.nextLine();
		for(int i=0;i<str.length();i++){
			n=str.charAt(i);
			if(n=='*'){
				count++;
			}
			else
				count1++;
		}
		if(count==count1)
			System.out.println(count-count1);
		if(count<count1)
			System.out.println(count1-count+".....times the # is less");
		if(count>count1)
			System.out.println(count1-count+".....times the * is great");





	}
}