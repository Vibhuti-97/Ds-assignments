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
	node swap(node head,int pos,int pos1)
	{
        int c=1;
        node temp=head,temp1=head,temp2=head.next,temp4=head.next;
        while(temp2!=null)
        {
            if(pos==c+1||c+1>pos)
                break;
            c++;
            temp=temp.next;
            temp2=temp2.next;
        }
        c=1;
        while(temp4!=null)
        {
            if(pos1==c+1||c+1>pos1)
                break;
            c++;
            temp1=temp1.next;
            temp4=temp4.next;
        }
        node temp5=temp2.next;
        temp.next=temp4;
        temp2.next=temp4.next;
        temp1.next=temp2;
        temp4.next=temp5;
		return head;
	}
}
class swapnodeslinkedlist
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
		System.out.println("Enter the first position to swap:");
		int pos=ob.nextInt();
        System.out.println("Enter the second position to swap:");
		int pos1=ob.nextInt();
        h=ob1.swap(h,pos,pos1);
        ob1.display(h);
	}
}