import java.util.Scanner;
public class unique
{
	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=ob.nextLine();
		String str1=result(str);
		System.out.println("The result is :"+str1);
	}
	static String result(String str)
	{
		if(str.length()==1)
			return str;
        String str2=str.substring(1);
        String str1="";
        if(str.charAt(0)!=str2.charAt(0))
        {
            str1+=str.charAt(0)+result(str2);
            return str1;
        }
        else
        {
            str1=result(str2);
            return str1;
        }
	}
}