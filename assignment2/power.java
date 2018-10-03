import java.util.Scanner;
public class power
{
	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=ob.nextInt();
		System.out.println("Enter the other number: ");
		int m=ob.nextInt();
		int product=result(n,m);
		System.out.println("The result is :"+product);
	}
	static int result(int a,int b)
	{
		if(b==1)
			return a;
        return a*result(a,b-1);
	}
}