/*
 Q4. Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
 */

public class palindrome {

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

		
		public boolean palindrome(Node head) 
		{
			Node fast=head,slow=head;
			while(fast.next!=null&&fast.next.next!=null)
			{
				slow=slow.next;
				fast=fast.next.next;
			}
			Node slowhead=reverse(slow.next);//time complexity :O(n/2)
			Node first=head;
			Node second=slowhead;
			while(second!=null) //time complexity :O(n/2)
			{
				
				if(first.data!=second.data)
				{
					reverse(slowhead);//time complexity :O(n/2)
					return false;
				}
				first=first.next;
				second=second.next;
			}
			reverse(slowhead);
			return true;
			
			
		}
		
		public static void main(String[]args) 
		{
			int arr[]= {0,0,1,2,2,1,0,0};
			palindrome r=new palindrome();
			Node head=r.a2ll(arr);
			boolean h=r.palindrome(head);
		System.out.println(h);
		}
		

}
