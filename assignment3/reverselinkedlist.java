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
	node reverse(node head)
	{
		node temp=head,p=null,n=null;
		while(temp!=null)
		{
			n=temp.next;
			temp.next=p;
			p=temp;
			temp=n;
		}
		head=p;
		return head;
	}
}
class reverselinkedlist
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
		h=ob1.reverse(h);
		ob1.display(h);
	}
}