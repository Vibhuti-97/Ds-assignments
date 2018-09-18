import java.util.Scanner;
public class maxfreq
{
	public static void main(String[] args)
	{
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str= ob.nextLine();
		str=str.trim();
		int j,i,x=0,c;
		char ch1=' ';
		char[] ch=str.toCharArray();
		for(i=0;i<ch.length;i++)
		{
			c=1;
			for(j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j]&&ch[i]!='0'&&ch[j]!='0')
				{
					c++;
					ch[j]='0';
				}
			}
			if(x<=c)
			{
				ch1=ch[i];
				x=c;
			}
		}
		System.out.print("The character with maxium frequency is : "+ch1+" with "+x+" occurences");
	}
}