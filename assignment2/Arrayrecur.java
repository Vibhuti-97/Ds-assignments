import java.util.Scanner;
public class Arrayrecur
{
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n=ob.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the element:");
            arr[i]=ob.nextInt();
        }
        System.out.print("Enter the element to search :");
        int ele=ob.nextInt();
        boolean result=search(arr,ele,arr.length);
        System.out.println("The search result is:"+result);
        if(result==true)
            System.out.print("The element is:"+ele);
    }
    static boolean search(int[] arr,int ele,int len)
    {
        if(len==0)
            return false;
        else if(arr[len-1]==ele)
            return true;
        return search(arr,ele,len-1);
    }
}