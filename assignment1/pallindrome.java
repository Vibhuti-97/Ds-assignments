import java.util.Scanner;
public class pallindrome
{
	public static void main(String[] args)
	{
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str= ob.nextLine();
		str=str.trim();
		int j,i,flag=0;
		char[] ch=str.toCharArray();
		for(i=0,j=ch.length-1;i<ch.length/2;i++,j--)
		{
			if(ch[i]!=ch[j])
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println("Pallindrome string");
		else
			System.out.println("Not Pallindrome string");
	}
}