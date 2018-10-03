import java.util.Scanner;
public class sum
{
	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=ob.nextLine();
		int s=result(str);
		System.out.println("The result is :"+s);
	}
	static int result(String str)
	{
        int x=0;
		if(str.length()==0)
			return 0;
        if((str.charAt(0))>=48&&(str.charAt(0))<=57)
        {
            x=str.charAt(0)-48+result(str.substring(1));
            return x;
        }
        x=result(str.substring(1));
        return x;
	}
}