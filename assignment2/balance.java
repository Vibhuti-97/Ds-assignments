import java.util.Scanner;
public class balance
{
	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=ob.nextLine();
		int s=result(str);
        if(s==0)
		    System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
	}
	static int result(String str)
	{
        int c=0;
        if(str.length()==0)
            return 0;
        if(str.charAt(0)=='('||str.charAt(0)=='{'||str.charAt(0)=='[')
        {
            c=1+result(str.substring(1));
            return c;
        }
        else
        {
            c=result(str.substring(1))-1;
            return c;
        }
	}
}