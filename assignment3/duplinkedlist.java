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
	node dup(node head)
	{
		node temp=head,temp1;
        while(temp.next!=null)
        {
            temp1=temp.next;
            while(temp1!=null)
                if(temp1.data==temp.data)
                    temp1=temp1.next;
                else
                    break;
            temp.next=temp1;
            if(temp.next!=null)
            temp=temp.next;
        }
        return head;
	}
}
class duplinkedlist
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
        h=ob1.dup(h);
        ob1.display(h);
	}
}