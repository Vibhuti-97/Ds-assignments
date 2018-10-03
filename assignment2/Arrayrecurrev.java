import java.util.Scanner;
public class Arrayrecurrev
{
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n=ob.nextInt();
        int[] arr=new int[n];
        int[] arr1=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the element:");
            arr[i]=ob.nextInt();
        }
        System.out.println("The original array is:");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        for(int i=0;i<n;i++)
            arr1[i]=rev(arr,arr.length-i-1);
        System.out.println("");
        System.out.println("The reversed array is:");
        for(int i=0;i<n;i++)
            if(arr1[i]!=-1)
            System.out.print(arr1[i]+" ");
    }
    static int rev(int[] arr,int len)
    {
        if(len==-1)
            return -1;
        return arr[len];
    }
}