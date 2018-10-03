import java.util.Scanner;
public class nfibo
{
	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n=ob.nextInt();
		int f=fibo(n);
		System.out.println("The nth term is :"+f);
	}
	static int fibo(int n)
	{
		if(n==1)
			return 0;
		else if(n==2)
			return 1;
		return fibo(n-1)+fibo(n-2);
	}
}