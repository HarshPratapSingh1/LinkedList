

public class add {
	 Node head;
		class Node{

			int data;
			Node next;
			
			Node(int d)
			{
				data=d;
				next=null;
			}
		}
		//Convert the array to LL
		public Node a2ll(int arr[]) 


		{	
			Node head=new Node(arr[0]);
			Node temp=head;
			for(int i=1;i<arr.length;i++)
			{
				Node mover=new Node(arr[i]);
				temp.next=mover;
				temp=temp.next;
			}
			return head;
		}
		
		
		//Display of output
		public void display(Node head) 

		{
			Node temp=head;
			while(temp!=null) 
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
		}
		
		//Reverse
		public Node reverse(Node head) 
		{	Node temp=head;
			Node prev=null;
			while(temp!=null) 
			{
				Node front=temp.next;
				temp.next=prev;
				prev=temp;
				temp=front;
				
			}
			return prev;
		}
		
		public Node add(Node head1,Node head2) 
		{
			Node dummy=new Node(0);
			Node temp=dummy;
			Node t1=reverse(head1);
			Node t2=reverse(head2);
			int carry=0;
			while(t1!=null&&t2!=null) 
			{	int sum=carry;
				if(t1!=null) 
				{
					sum+=t1.data;
				}
				if(t2!=null) 
				{
					sum+=t2.data;
				}
				temp.next=new Node(sum%10);
				carry=sum/10;
				temp=temp.next;
				if(t1!=null) 
				{
					t1=t1.next;
				}
				if(t2!=null) 
				{
					t2=t2.next;
				}
				
			}
			if(carry!=0) 
			{Node h=new Node(carry);
			temp.next=h;
			h=null;
			dummy.next=reverse(dummy.next);
				return dummy.next;
			}
			
			dummy.next=reverse(dummy.next);
			return dummy.next;
		}
		
		public static void main(String[]args) 
		{
			int arr1[]= {1,2,4};
			int arr2[]= {2,3,5};
			add a=new add();
			Node head2=a.a2ll(arr2);
			Node head1=a.a2ll(arr1);
			Node head=a.add(head1, head2);
			a.display(head);
		}
}
