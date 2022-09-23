//factorial coding using recursion function
import java.util.Scanner;
 
public class Fact{

public static void main(String[] agrs){
	int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number Boss : ");
	num=sc.nextInt();
	int result=fact(num);
	System.out.println(result);                  //inputs

}
public static int  fact(int x){
	if(x>1){
	return x*fact(x-1);         // here recursion is used the class fact is called within the class as fact(x-1)
}
else
{
	return 1;
}


}
}