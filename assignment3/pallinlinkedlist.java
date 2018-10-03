import java.util.Scanner;
class node
{
	int data;
	node next;
	node head=null;
	node()
	{
		data=0;
		next=null;
	}
	node(int x)
	{
		data=x;
		next=null;
	}
	node add(int data)
	{
		node l=new node(data);
		if(head==null)
			head=l;
		else
		{
			node temp=head;
			while(temp.next!=null)
				temp=temp.next;
			temp.next=l;
		}
		return head;
	}
	void display(node head)
	{
		node temp=head;
		System.out.println("The elements are:-");
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
    int len(node head)
	{
		node temp=head;
        int c=0;
		while(temp!=null)
		{
			temp=temp.next;
            c++;
		}
		return c;
	}
	void pallin(node head,int length)
	{
		node temp=head,temp1=head,p=null,n=null;
        int flag=0;
        while(temp1.next!=null)
		{
            temp1=temp1.next;
			n=temp.next;
			temp.next=p;
			p=temp;
			temp=n;
            temp1=(temp1.next==null)?null:temp1.next;
            if(temp1==null)
                break;
		}
		if(length%2!=0)
            temp=temp.next;
        while(temp!=null&&p!=null)
        {
            if(temp.data!=p.data)
            {
                flag=1;
                break;
            }
            temp=temp.next;
            p=p.next;
        }
        if(flag==1)
            System.out.println("Not a pallindrome list");
        else
            System.out.println("A pallindrome list");
	}
}
class pallinlinkedlist
{
	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter the number of elements to insert:");
		int n=ob.nextInt();
		node ob1=new node();
		node h=null;
		while(n>0)
		{
			System.out.print("Enter the value:");
			int val=ob.nextInt();
			h=ob1.add(val);
			n--;
		}
		ob1.display(h);
        int x=ob1.len(h);
	    ob1.pallin(h,x);
	}
}