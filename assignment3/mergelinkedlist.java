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
	node merge(node head,node head1)
	{
		node temp=head;
        while(temp.next!=null)
            temp=temp.next;
        temp.next=head1;
        return head;
	}
}
class mergelinkedlist
{
	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter the number of elements to insert of first list:");
		int n=ob.nextInt();
		node ob1=new node();
        node ob2=new node();
		node h=null;
		while(n>0)
		{
			System.out.print("Enter the value:");
			int val=ob.nextInt();
			h=ob1.add(val);
			n--;
		}
		ob1.display(h);
        System.out.print("Enter the number of elements to insert of second list:");
		int n1=ob.nextInt();
		node h1=null;
		while(n1>0)
		{
			System.out.print("Enter the value:");
			int val=ob.nextInt();
			h1=ob2.add(val);
			n1--;
		}
		ob2.display(h1);
        h=ob1.merge(h,h1);
        ob1.display(h);
	}
}