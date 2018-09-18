import java.util.Scanner;
public class Subsequences
{
	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=ob.nextLine();
		subs(str,"");
	}
	static void subs(String input,String output)
	{
		if(input.length()==0)
		{
			System.out.print(output+", ");
			return;
		}
		subs(input.substring(1),output);
		subs(input.substring(1),output+input.charAt(0));
	}
}