import java.util.Scanner;
class Binary{
	
	int Sort(int[] arr,int i,int j,int s){
		if(j>=i)
		{
		int mid=(i+j)/2;
		if(s==arr[mid])
			return mid;
		if(s<arr[mid])
			return Sort(arr,i,mid-1,s);      //recurssion calling
		return Sort(arr,mid+1,j,s);
	}
	return -1;
}
public static void main(String[] agrs)
	{
		Binary so=new Binary();      // objaect for the class 
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number BOSS : ");
		num=sc.nextInt();
		int[] arr=new int[num];
		for(int i=0;i<num;i++)
			arr[i]=sc.nextInt();
		System.out.println("Enter the value to Search : ");
		int Search=sc.nextInt();                                         // up to this only inputs

		int result = so.Sort(arr,0,arr.length-1,Search);
		if(result==-1)
			System.out.println("Sorry boss the value is Not Present in this array");
		else
			System.out.println("The Value is found at the index of"+result);
	}
	}