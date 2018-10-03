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
	int result(node head)
	{
		node temp=head;
        node head2=null,temp2=null;
        node head1=null,temp1=null;
        while(temp!=null)
        {
            if(temp.data%2==0)
            {
                node n=new node(temp.data);
                if(head2==null)
                    head2=temp2=n;
                else if(head2!=null)
                {
                    temp2=head2;
                    while(temp2.next!=null)
                        temp2=temp2.next;
                    temp2.next=n;
                    temp2=temp2.next;
                }    
            }
            else
            {
                node n=new node(temp.data);
                if(head1==null)
                    head1=temp1=n;
                else if(head1!=null)
                {
                    temp1=head1;
                    while(temp1.next!=null)
                        temp1=temp1.next;
                    temp1.next=n;
                    temp1=temp1.next;
                } 
            }
            temp=temp.next;
        }
        if(head2!=null&&head1!=null)
        {
            temp1.next=head2;
            temp=head1;
            System.out.println("");
            System.out.print("The new list is:");
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            return 1;
        }
        else
            return 0;
	}
}
class evenoddlinkedlist
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
        int x=ob1.result(h);
        if(x==0)
            ob1.display(h);
	}
}