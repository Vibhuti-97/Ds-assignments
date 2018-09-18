import java.util.Scanner;
public class changecase
{
	public static void main(String[] args)
	{
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str= ob.nextLine();
		str=str.trim();
		int j,i,flag=0;
		char[] ch=str.toCharArray();
		for(i=0;i<ch.length;i++)
		{
			if(Character.isUpperCase(ch[i]))
				ch[i]=Character.toLowerCase(ch[i]);
			else
				ch[i]=Character.toUpperCase(ch[i]);
		}
		System.out.print("The new string is : ");
		for(i=0;i<ch.length;i++)
			System.out.print(ch[i]);
	}
}